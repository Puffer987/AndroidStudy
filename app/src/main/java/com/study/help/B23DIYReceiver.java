package com.study.help;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class B23DIYReceiver extends BroadcastReceiver {
    private static final String TAG = "广播接收类";
    private final String ACTION = "DIY";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(TAG, "onReceive：" + intent.getAction());
        Toast.makeText(context, "收到了", Toast.LENGTH_LONG).show();
    }

}
