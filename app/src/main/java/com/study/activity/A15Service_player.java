package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.study.R;

public class A15Service_player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a15_service_player);
    }
    public void playMusic(View view) {
        Intent intent = new Intent(this, S15MyService.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Key", S15MyService.Control.PLAY);
        intent.putExtras(bundle);
        startService(intent);
    }

    public void pauseMusic(View view) {
        Intent intent = new Intent(this, S15MyService.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Key", S15MyService.Control.PAUSE);
        intent.putExtras(bundle);
        startService(intent);
    }

    public void stopMusic(View view) {
        Intent intent = new Intent(this, S15MyService.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Key", S15MyService.Control.STOP);
        intent.putExtras(bundle);
        startService(intent);
        //或者是直接如下调用
        //Intent intent = new Intent(this, MyService.class);
        //stopService(intent);
    }
}