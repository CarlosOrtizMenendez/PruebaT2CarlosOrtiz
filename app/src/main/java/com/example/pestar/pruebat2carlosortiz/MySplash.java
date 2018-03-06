package com.example.pestar.pruebat2carlosortiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MySplash extends AppCompatActivity implements Animation.AnimationListener{

    ImageView Imagen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Imagen = (ImageView) findViewById(R.id.imagen_fox);
        Animation zoom = AnimationUtils.loadAnimation(this, R.anim.alpha);
        Imagen.setAnimation(zoom);
        zoom.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        Intent intent = new Intent(this, MyLogin.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}