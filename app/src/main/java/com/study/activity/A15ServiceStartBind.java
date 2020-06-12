package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.study.R;

public class A15ServiceStartBind extends AppCompatActivity {
    private static final String TAG = "A15ServiceStartBind";

    Button bindBtn;
    Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a15_service_start_bind);

        bindBtn = (Button)findViewById(R.id.bindBtn);
        startBtn = (Button)findViewById(R.id.startBtn);

        bindBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.study");
                intent.setPackage("com.study");
                bindService(intent, conn, BIND_AUTO_CREATE);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.study");
                intent.setPackage("com.study");
                startService(intent);
            }
        });

    }
    ServiceConnection conn = new ServiceConnection() {
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.v(TAG, "onServiceConnected");
        }
        public void onServiceDisconnected(ComponentName name) {
            Log.v(TAG, "onServiceDisconnected");
        }
    };
    @Override
    protected void onDestroy() {
        Log.v(TAG, "onDestroy unbindService");
        unbindService(conn);
        super.onDestroy();
    };
}