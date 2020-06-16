package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.study.R;
import com.study.help.SDFileHelper;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.io.Writer;

public class a08_file extends AppCompatActivity {


    private static final String FILENAME = "Puffer.txt";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a08_file);
        Log.i("文件操作", "onCreate: " + isExternalStorageWritable());
    }

    public boolean isExternalStorageWritable() {
        String state = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(state)) {
            return true;
        }
        return false;
    }

    public void save(View view) throws IOException {
        File sdCard = getExternalFilesDir(null);
        sdCard = new File(sdCard, "/MyFiles");
        sdCard.mkdirs();// 创建MyFiles目录(可创建多级目录)
        sdCard = new File(sdCard, FILENAME);
        FileOutputStream out = new FileOutputStream(sdCard);
        Writer writer = new OutputStreamWriter(out);
        try {
            EditText text = findViewById(R.id.i08_text_area);
            String str = text.getText().toString();
            writer.write(str);
            Toast.makeText(this, "保存成功", Toast.LENGTH_SHORT).show();
        } finally {
            writer.close();
        }
    }

    public void clear(View view) {
        EditText textArea = findViewById(R.id.i08_text_area);
        textArea.setText("");

    }

    public void read(View view) throws IOException {
        BufferedReader reader = null;
        StringBuilder data = new StringBuilder();
        TextView dataView = findViewById(R.id.i08_display);
        try {
            File sdCard = getExternalFilesDir(null);
            sdCard = new File(sdCard, "/MyFiles/" + FILENAME);
            FileInputStream in = new FileInputStream(sdCard);
            reader = new BufferedReader(new InputStreamReader(in));
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
            }
            dataView.setText(data);
        } catch (FileNotFoundException e) {
            dataView.setText("没有发现保存的数据");
        } finally {
            if (reader != null) {
                reader.close();
            } else {
                System.err.println("============");
            }

        }
    }

    public void modify(View view) {
        TextView dataView = findViewById(R.id.i08_text_area);
        TextView displayView = findViewById(R.id.i08_display);
        String display = displayView.getText().toString();
        dataView.setText(display);
    }

    public void printPath(View view) {
        StringBuffer out = new StringBuffer();
        out.append("getDir(\"文件名\", MODE_PRIVATE).getAbsolutePath():\n\t\t" + getDir("文件名", MODE_PRIVATE).getAbsolutePath());
        out.append("\n\nEnvironment.getDataDirectory():\n\t\t" + Environment.getDataDirectory());

        out.append("\n\ngetFilesDir().getAbsolutePath():\n\t\t" + getFilesDir().getAbsolutePath());
        out.append("\n\ngetExternalFilesDir(null).getAbsolutePath():\n\t\t"+getExternalFilesDir(null).getAbsolutePath());
        out.append("\n\ngetCacheDir().getAbsolutePath():\n\t\t" + getCacheDir().getAbsolutePath());
        out.append("\n\ngetExternalCacheDir().getAbsolutePath():\n\t\t"+getExternalCacheDir().getAbsolutePath());

        TextView textView = findViewById(R.id.i08_display);
        textView.setText(out);

        // out.append("().getAbsolutePath():\t+().getAbsolutePath());
    }
}