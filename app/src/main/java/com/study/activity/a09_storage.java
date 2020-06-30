package com.study.activity;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.study.R;

public class a09_storage extends AppCompatActivity {

    private static final String FILENAME = "Adolfpuffer.txt";
    private static final String TAG = "a09_storage";
    private TextView dataView;
    private Button saveButton;
    private Button loadButton;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a09_storage);
        dataView = (TextView) findViewById(R.id.data_view);
        saveButton = (Button) findViewById(R.id.save_button);
        loadButton = (Button) findViewById(R.id.load_button);
        editText = findViewById(R.id.i09_edit_text);
        setListener();

        String text = load();
        if (!TextUtils.isEmpty(text)) {
            editText.setText(text);
            editText.setSelection(text.length());
            Toast.makeText(this, "加载完成", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String input = editText.getText().toString();
        save(input);
    }

    public void save(String input) {
        FileOutputStream out = null;
        BufferedWriter writer = null;
        try {
            out = openFileOutput("data", Context.MODE_PRIVATE);
            writer = new BufferedWriter(new OutputStreamWriter(out));
            writer.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String load() {
        FileInputStream in = null;
        BufferedReader reader = null;
        StringBuilder context = new StringBuilder();
        try {
            in = openFileInput("data");
            reader = new BufferedReader(new InputStreamReader(in));
            String line = "";
            while ((line = reader.readLine()) != null) {
                context.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return context.toString();
    }


    private void setListener() {
        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    saveData();
                } catch (IOException e) {
                }
                Toast.makeText(a09_storage.this, "保存成功",
                        Toast.LENGTH_SHORT).show();
            }
        });
        loadButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    loadData();
                } catch (FileNotFoundException e) {
                } catch (IOException e) {
                }
            }
        });
    }

    public void saveData() throws IOException {
        File sdCard = getExternalFilesDir(null);
        // 获取外部存储设备（SD卡）的路径
        Log.i(TAG, sdCard.getAbsolutePath());
        // 查看LogCat,获取的sd卡的绝对路径为 /storage/sdcard
        sdCard = new File(sdCard, "/MyFiles");
        sdCard.mkdirs();// 创建MyFiles目录(可创建多级目录)
        sdCard = new File(sdCard, FILENAME);
        FileOutputStream out = new FileOutputStream(sdCard);
        Writer writer = new OutputStreamWriter(out);
        try {
            String str = "来自保存在内部存储设备的数据";
            writer.write(str);
        } finally {
            writer.close();
        }
    }

    public void loadData() throws FileNotFoundException, IOException {
        BufferedReader reader = null;
        StringBuilder data = new StringBuilder();
        try {
//            File sdCard = Environment.getExternalStorageDirectory();
            File sdCard = getExternalFilesDir(null);
            sdCard = new File(sdCard, "/MyFiles/" + FILENAME);
            FileInputStream in = new FileInputStream(sdCard);
            reader = new BufferedReader(new InputStreamReader(in));
            String line = new String();
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
}