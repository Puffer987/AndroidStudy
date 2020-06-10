package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.study.R;

public class a07_dynamicLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a07_dynamic_layout);
//        dynamic_add();
//        myDynamic();
    }

    protected void dynamic_add() {
        LinearLayout rootLayout = (LinearLayout) findViewById(R.id.dym_main);

        RelativeLayout relativeLayout = new RelativeLayout(this);

        Button button = new Button(this);
        TextView textView = new TextView(this);
        button.setText("button");
        textView.setText("Some text");

        LinearLayout.LayoutParams relativeLayout_parent_params
                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams button_parent_params
                = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        RelativeLayout.LayoutParams text_parent_params
                = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        button_parent_params.addRule(RelativeLayout.ALIGN_PARENT_LEFT);
        text_parent_params.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);

        relativeLayout.addView(button, button_parent_params);
        relativeLayout.addView(textView, text_parent_params);
        rootLayout.addView(relativeLayout, relativeLayout_parent_params);
    }

    protected void myDynamic() {
        LinearLayout rootLayout = (LinearLayout) findViewById(R.id.dym_main);

//        RelativeLayout relativeLayout = new RelativeLayout(this);

        rootLayout.setOrientation(LinearLayout.HORIZONTAL);

        Button button = new Button(this);
        TextView textView = new TextView(this);
        button.setText("button");
        textView.setText("Some text");

        LinearLayout.LayoutParams button_parent_params
                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout.LayoutParams text_parent_params
                = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        button_parent_params.weight = 3;
        text_parent_params.weight = 1;

        rootLayout.addView(button, button_parent_params);
        rootLayout.addView(textView, text_parent_params);
    }

    static int initId = 1;

    public void dynAdd(View view) {
        LinearLayout rootLayout = (LinearLayout) findViewById(R.id.dym_main);
            dynItem();
    }

    protected void dynItem() {
        LinearLayout root = (LinearLayout) findViewById(R.id.dym_main);
        LinearLayout contain = new LinearLayout(this);
        EditText editText = new EditText(this);
        Button comBtn = new Button(this);
        Button delBtn = new Button(this);

        comBtn.setText("提交");
        delBtn.setText("删除");
        comBtn.setId(initId++);
        comBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(a07_dynamicLayout.this,""+v.getId(),Toast.LENGTH_LONG).show();
            }
        });

        contain.addView(editText);
        contain.addView(comBtn);
        contain.addView(delBtn);

        root.addView(contain);

    }

    public void onClick(View v) {

    }
}