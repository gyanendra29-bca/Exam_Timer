package com.example.examtimer;

import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer m1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView nmuber = findViewById(R.id.mnumber);
        final TextView done = findViewById(R.id.done);

        m1 = MediaPlayer.create(MainActivity.this, R.raw.sixth);

        new CountDownTimer(10000, 1000){
            public void  onTick(long millisecondUntilDone){
                nmuber.setText("Time:" + String.valueOf(millisecondUntilDone/1000));
            }

            @Override
            public void onFinish() {
                done.setText("Done!!");
                m1.start();
            }


        }.start();
    }
}