package com.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class a02_bigger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a02_bigger);
    }

    int size = 30;

    public void bigger(View v) {     // 按钮对应的 onclick 响应
        TextView txv;
        txv = findViewById(R.id.txv);  // 根据ID找到对应的text对象
        txv.setTextSize(++size);       // 修改对象的字符大小-size
    }

    public void display(View v) {     // 另外一个按钮对应的 onclick 响应
        EditText name = findViewById(R.id.name);  //还是根据ID找到对象，并进行接下来的操作
        TextView text2 = findViewById(R.id.txv);

        text2.setText(name.getText().toString());   // 设置字符
    }
}