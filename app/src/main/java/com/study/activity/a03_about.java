package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.TextView;

import com.study.R;

public class a03_about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a03_about);

        PackageManager manager = getPackageManager();
        PackageInfo info = null;

        try {
            info = manager.getPackageInfo(getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        String version = info == null ? getString(R.string.version_name): info.versionName;
        String msg = String.format(getString(R.string.version_info), version);

        TextView ver = (TextView) findViewById(R.id.version);
        ver.setText(msg);
    }

}