package com.study.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.study.R;

public class A30HandlerActivity extends AppCompatActivity {

    private EditText in;
    private TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a30_handler);
        in = findViewById(R.id.i30_in);
        out = findViewById(R.id.i30_out);
    }

    private Handler uiHandler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(@NonNull Message msg) {
            switch (msg.what) {
                case 1:
                    StringBuilder outStr = new StringBuilder();
                    outStr.append("两个arg的和：" + msg.arg1 + msg.arg2 + "\n");
                    outStr.append(msg.getData().getString("key") + "\n");
                    outStr.append(msg.obj);
                    A30HandlerActivity.this.out.setText(outStr);
                    break;
            }
            return false;
        }
    });

    public void handlerSend(View view) {
        ProgressDialog progress = new ProgressDialog(this);
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setMax(100);
        progress.show();
        new Thread(new Runnable() {
            @Override
            public void run() {
                String text = in.getText().toString();
                StringBuilder outStr = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    outStr.append(text).append(i + 1).append("\n");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progress.setProgress(i + 1);
                }
                progress.dismiss();

                Message msg = new Message();
                msg.what = 1;
                msg.arg1 = 422;
                msg.arg2 = 666;
                Bundle data = new Bundle();
                data.putString("key", "通过bundle传值");
                msg.setData(data);

                msg.obj = outStr;
                uiHandler.sendMessage(msg);
            }
        }).start();
    }

    public void handlePost(View view) {
        ProgressDialog progress = new ProgressDialog(this);
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setMax(100);
        progress.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                String text = in.getText().toString();
                StringBuilder outStr = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    outStr.append(text).append(i + 1).append("\n");
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    progress.setProgress(i + 1);
                }
                progress.dismiss();
                Runnable runnable = new Runnable() {
                    @Override
                    public void run() {
                        A30HandlerActivity.this.out.setText(outStr);
                    }
                };
                uiHandler.post(runnable);
            }
        }).start();
    }
}