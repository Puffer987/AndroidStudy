package com.study.activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.study.MainActivity;
import com.study.R;

@RequiresApi(api = Build.VERSION_CODES.O)
public class A26Notification extends AppCompatActivity implements View.OnClickListener {

    private Button notice0;
    private Button notice1;
    private Button notice2;
    private Button notice3;
    private Button notice4;
    private Button notice5;
    private Button clear;
    private int nId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a26_notification);
        createNotificationChannel("notice0", "0通知NONE", NotificationManager.IMPORTANCE_NONE);
        createNotificationChannel("notice1", "1通知MIN", NotificationManager.IMPORTANCE_MIN);
        createNotificationChannel("notice2", "2通知LOW", NotificationManager.IMPORTANCE_LOW);
        createNotificationChannel("notice3", "3通知DEFAULT", NotificationManager.IMPORTANCE_DEFAULT);
        createNotificationChannel("notice4", "4通知HIGH", NotificationManager.IMPORTANCE_HIGH);
        createNotificationChannel("notice5", "5通知MAX", NotificationManager.IMPORTANCE_MAX);
        initButton();
    }

    private void createNotificationChannel(String channelId, String channelName, int importance) {
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        NotificationChannel channel = new NotificationChannel(channelId, channelName, importance);
        manager.createNotificationChannel(channel);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.i26_notice0:
                createNotice("notice0", "标题notice0", "通知等级通知IMPORTANCE_NONE");
                break;
            case R.id.i26_notice1:
                createNotice("notice1", "标题notice1", "通知等级通知IMPORTANCE_MIN");
                break;
            case R.id.i26_notice2:
                createNotice("notice2", "标题notice2", "通知等级通知IMPORTANCE_LOW");
                break;
            case R.id.i26_notice3:
                createNotice("notice3", "标题notice3", "通知等级通知IMPORTANCE_DEFAULT");
                break;
            case R.id.i26_notice4:
                createNotice("notice3", "标题notice4", "通知等级通知IMPORTANCE_HIGH");
                break;
            case R.id.i26_notice5:
                createNotice("notice5", "标题notice5", "通知等级通知IMPORTANCE_MAX");
                break;
            case R.id.i26_clear:
                NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                for (int i = 1; i < nId; i++) {
                    manager.cancel(i);
                }
                // 以上循环等于以下语句
                // manager.cancelAll();
                break;
        }
    }

    public void createNotice(String channelId, String title, String text) {
        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 0);
        NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        NotificationChannel channel = manager.getNotificationChannel(channelId);
        if (channel.getImportance() == NotificationManager.IMPORTANCE_NONE) {
            Intent i = new Intent(Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS);
            i.putExtra(Settings.EXTRA_APP_PACKAGE, getPackageName());
            i.putExtra(Settings.EXTRA_CHANNEL_ID, channel.getId());
            startActivity(i);
            Toast.makeText(this, "通知被关闭，请手动打开通知", Toast.LENGTH_SHORT).show();
        }

        Notification notification = new NotificationCompat.Builder(this, channelId)
                .setContentTitle(title)
                .setContentText(text)
                .setWhen(System.currentTimeMillis())
                .setSmallIcon(R.mipmap.ic_launcher)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.adolf_study))
                .setContentIntent(pendingIntent)
                // .setAutoCancel(true)
                .build();
        manager.notify(nId++, notification);

    }

    private void initButton() {
        notice0 = findViewById(R.id.i26_notice0);
        notice1 = findViewById(R.id.i26_notice1);
        notice2 = findViewById(R.id.i26_notice2);
        notice3 = findViewById(R.id.i26_notice3);
        notice4 = findViewById(R.id.i26_notice4);
        notice5 = findViewById(R.id.i26_notice5);
        clear = findViewById(R.id.i26_clear);
        notice0.setOnClickListener(this);
        notice1.setOnClickListener(this);
        notice2.setOnClickListener(this);
        notice3.setOnClickListener(this);
        notice4.setOnClickListener(this);
        notice5.setOnClickListener(this);
        clear.setOnClickListener(this);
    }
}