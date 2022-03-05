package com.example.exampleapplication;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onBtnClick(View view){
        EditText usernameCtrl = findViewById(R.id.editTextUserName);
        EditText passwordCtrl = findViewById(R.id.editTextPassword);
        ImageView catImageView = findViewById(R.id.imageView);
        Log.i(TAG, "username: " + usernameCtrl.getText().toString() + " password: " + passwordCtrl.getText().toString());
        Toast.makeText(this, usernameCtrl.getText().toString() +" Logged in successfully!", Toast.LENGTH_SHORT).show();
    }

    public void onChangePictureBtnClick(View view){
        ImageView catImageView = findViewById(R.id.imageView);
        catImageView.setImageResource(R.drawable.b);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}