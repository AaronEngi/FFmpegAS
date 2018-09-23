package com.ywl5320.ffmpegas;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;

public class MainActivity extends Activity {

    FFmpegPlayer fFmpegPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fFmpegPlayer = new FFmpegPlayer();
        fFmpegPlayer.playMyMedia(Environment.getExternalStorageDirectory() + "/testffmpeg.m4a");
    }
}
