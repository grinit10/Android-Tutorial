package com.example.fadingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void changeImage(View view){
        ImageView imageViewA = findViewById(R.id.imageViewA);
        ImageView imageViewB = findViewById(R.id.imageViewB);
        if(imageViewA.getAlpha() == 0){
            imageViewA.animate().alpha(1).setDuration(2000);
            imageViewB.animate().alpha(0).setDuration(2000);
        } else {
            imageViewA.animate().alpha(0).setDuration(2000);
            imageViewB.animate().alpha(1).setDuration(2000);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}