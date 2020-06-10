package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.study.R;
import com.study.help.SDFileHelper;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class a08_file extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a08_file);
    }

    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    public void createFile(View view) {
        if (isExternalStorageWritable()) {
            System.out.println("有权限");

            try {
                switch (view.getId()) {
                    case R.id.externalStoragePublic: {
                        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES),
                                "123.png");
                        file.createNewFile();
                    }
                    case R.id.externalFiles: {
                        new File(getExternalFilesDir(null), "123").createNewFile();
                    }
                    case R.id.externalCache: {
                        new File(getExternalCacheDir(), "321").createNewFile();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("创建成功");
        } else {
            System.out.println("没有权限");
        }
    }
}