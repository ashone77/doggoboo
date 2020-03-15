package com.example.doggoboo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        final MediaPlayer catSound = MediaPlayer.create(this, R.raw.cat_meow);
        final MediaPlayer dogSound = MediaPlayer.create(this, R.raw.dog_bark);
        final MediaPlayer chickenSound = MediaPlayer.create(this, R.raw.chicken_sound);
        final MediaPlayer owlSound = MediaPlayer.create(this, R.raw.owl_sound);

        Button catMeow = (Button) this.findViewById(R.id.cat);
        final Button dogBark = (Button) this.findViewById(R.id.dog);
        Button chickenCoo = (Button) this.findViewById(R.id.chicken);
        Button owlHoot = (Button) this.findViewById(R.id.owl);

        catMeow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                catSound.start();
            }
        });

        dogBark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dogSound.start();
            }
        });

        chickenCoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chickenSound.start();
            }
        });

        owlHoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                owlSound.start();
            }
        });

    }
}
