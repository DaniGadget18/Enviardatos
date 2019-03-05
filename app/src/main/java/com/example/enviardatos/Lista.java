package com.example.enviardatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;

import java.lang.reflect.Method;

public class Lista extends AppCompatActivity {

    ListView lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lista = findViewById(R.id.ListViewNombres);

    }


    public void cargar(View view) {

        JSONArray js = new JSONArray(Request.Method.GET, "http://nuevo.rnrsiilge-org.mx/ListaNombre", null, new Response.Listener<JsonArray>() {
            @Override
            public void onResponse(JsonArray response) {
                Gson g = new Gson();



            }
        })



    }
}
