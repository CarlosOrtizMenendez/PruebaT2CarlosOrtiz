package com.example.pestar.pruebat2carlosortiz;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

public class MyMain extends AppCompatActivity {

    private TextView mrfox;
    private SwipeRefreshLayout swipe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);
        Typeface face=Typeface.createFromAsset(getAssets(),"fonts/AmaticSC-Regular.ttf");
        swipe = (SwipeRefreshLayout) findViewById(R.id.swipe_container);
        mrfox = (TextView) findViewById(R.id.tv_MrFox);
        mrfox.setTypeface(face);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        swipe.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Snackbar.make(swipe, "Has refrescado la pagina", Snackbar.LENGTH_LONG).show();
            }
        });

    }

}
