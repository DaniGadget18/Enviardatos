package com.example.enviardatos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.example.enviardatos.Modelo.Persona;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        texto = findViewById(R.id.editext);

    }

    public void enviar(View view) throws JSONException {
        final JSONObject datos = new JSONObject();
        datos.put("Nombre",texto.getText().toString());
        String url = "http://nuevo.rnrsiilge-org.mx/nombre";

        // http://nuevo.rnrsiilge-org.mx/nombre&
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.POST, url,datos, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                Log.d("Mensaje", response.toString());
                Toast.makeText(MainActivity.this, "Persona" + response.toString(), Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        VolleyS.getInstance(this).getmRequestQueue().add(request);
    }
}
