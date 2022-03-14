package com.example.timerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    public void show(View view) {
        textView.setVisibility(View.VISIBLE);
    }

    public void hide(View view) {
        textView.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewThang);

        new CountDownTimer(10000, 100) {

            public void onTick(long millisecondsUntilDone) {
                Log.i("Seconds Left!", String.valueOf(millisecondsUntilDone / 1000));
            }

            public void onFinish() {
                Log.i("We're done!", "No more countdown");
            }
        }.start();

        /*
        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                Log.i("Hey it's us","A second passed by");

                handler.postDelayed(this, 1000);
            }
        };

        handler.post(run);
        */
    }
}