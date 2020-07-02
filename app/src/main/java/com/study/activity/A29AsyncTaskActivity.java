package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.study.R;
import com.study.help.AT29Progress;

public class A29AsyncTaskActivity extends AppCompatActivity {

    private EditText in;
    private TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a29_async_task);
        in = findViewById(R.id.i29_in);
        out = findViewById(R.id.i29_out);
    }

    public void doTask(View view) {
        String s = in.getText().toString();
        new AT29Progress(new Callback()).execute(s);
    }

    public class Callback {
        private ProgressDialog progress;
        public Context getContext(){
            progress = new ProgressDialog(A29AsyncTaskActivity.this);
            progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
            progress.setMax(100);
            return A29AsyncTaskActivity.this;
        }

        public void setOut(String s){
            out.setText(s);
        }
    }
}