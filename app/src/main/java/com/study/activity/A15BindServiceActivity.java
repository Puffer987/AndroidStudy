package com.study.activity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.study.R;

public class A15BindServiceActivity extends AppCompatActivity implements View.OnClickListener {
    private String TAG = "Activity按钮";
    private Button btnStart;
    private Button btnStop;
    private Button btnBind;
    private Button btnCancel;
    private Button btnStatus;
    private Intent intent;
    private boolean isConn = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a15_service_start_bind);

        btnStart = findViewById(R.id.btnStart);
        btnStop = findViewById(R.id.btnStop);
        btnBind = findViewById(R.id.btnBind);
        btnCancel = findViewById(R.id.btnCancel);
        btnStatus = findViewById(R.id.btnStatus);

        intent = new Intent(this, S15MyService.class);

        btnStart.setOnClickListener(this);
        btnStop.setOnClickListener(this);
        btnBind.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
        btnStatus.setOnClickListener(this);

    }

    S15MyService.MyBinder binder;
    private ServiceConnection conn = new ServiceConnection() {
        //Activity与Service断开连接时回调该方法
        @Override
        public void onServiceDisconnected(ComponentName name) {
            Log.i("onServiceDisconnected","onServiceConnected方法");
        }

        //Activity与Service连接成功时回调该方法
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            Log.i("ServiceConnection","onServiceConnected方法");
            binder = (S15MyService.MyBinder) service;
        }
    };

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnStart:
                Log.i(TAG, "开启服务");
                startService(intent);
                break;
            case R.id.btnStop:
                Log.i(TAG, "关闭服务");
                stopService(intent);
                break;
            case R.id.btnBind:
                Log.i(TAG, "绑定服务");
                bindService(intent, conn, Service.BIND_AUTO_CREATE);
                isConn = true;
                break;
            case R.id.btnCancel:
                Log.i(TAG, "解绑服务");
                if (isConn) {
                    unbindService(conn);
                    isConn = false;
                } else
                    Toast.makeText(this, "没有绑定服务", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnStatus:
                Log.i(TAG, "获取状态");
                if (isConn)
                    Toast.makeText(getApplicationContext(), "Service的count的值为:" + binder.getCount(), Toast.LENGTH_SHORT).show();
                else Toast.makeText(this, "没有绑定服务", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}