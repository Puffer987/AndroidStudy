package com.study;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.LinkedList;

public class a10_dymaticView extends AppCompatActivity {
    private LinearLayout linearLayout;
    //Button索引
    private LinkedList<Button> ListBtn_Show;
    //TextView索引
    private LinkedList<TextView> ListText_Def;
    private Button btn_add, btn_edit;
    //判断btn_edit的状态
    private int EDITSTATE = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a10_dymatic_view);
        inited();
    }

    private void inited() {
        linearLayout = (LinearLayout) findViewById(R.id.linearlayout);
        ListBtn_Show = new LinkedList<Button>();
        ListText_Def = new LinkedList<TextView>();
        btn_edit = (Button) findViewById(R.id.btn_edit);
        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addBtn();//动态添加按钮
            }
        });
        btn_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //判断编辑按钮的状态
                if (EDITSTATE == 0) {
                    btn_edit.setText("确定");
                    EDITSTATE = 1;
                } else if (EDITSTATE == 1) {
                    btn_edit.setText("编辑");
                    EDITSTATE = 0;
                }
            }
        });
    }

    private void addBtn() {//动态添加按钮
        //添加承载两个按钮的LinearLayout
        LinearLayout linear_btn = new LinearLayout(this);
        linear_btn.setOrientation(LinearLayout.HORIZONTAL);
        LinearLayout.LayoutParams liParam = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        linear_btn.setLayoutParams(liParam);

        //添加Button
        Button btnShow = new Button(this);
        LinearLayout.LayoutParams btnAddPar = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, 80, 3);//设置宽高及占比
        btnAddPar.setMargins(0, 10, 0, 10);
        btnShow.setLayoutParams(btnAddPar);
        btnShow.setText(ListBtn_Show.size() + "");
        btnShow.setTextColor(Color.argb(255, 255, 255, 255));
        btnShow.setBackgroundColor(Color.argb(255, 52, 171, 139));
        btnShow.setOnClickListener(new View.OnClickListener() {//动态添加点击事件
            @Override
            public void onClick(View view) {
                if (EDITSTATE == 1)
                    delBtn(view);//动态删除按钮
            }
        });
        linear_btn.addView(btnShow);//把btnShow添加到linear_btn中
        ListBtn_Show.add(btnShow);//把btnShow添加到索引中

        //添加TextView
        TextView textDef = new TextView(this);
        LinearLayout.LayoutParams btnDefPar = new LinearLayout.LayoutParams
                (ViewGroup.LayoutParams.WRAP_CONTENT, 80, 1);//设置宽高及占比
        btnDefPar.setMargins(0, 10, 0, 10);
        textDef.setLayoutParams(btnDefPar);
        textDef.setText("设为默认");
        textDef.setGravity(Gravity.CENTER);
        textDef.setTextColor(Color.argb(255, 255, 255, 255));
        textDef.setBackgroundColor(Color.argb(255, 52, 171, 139));
        textDef.setOnClickListener(new View.OnClickListener() {//动态添加点击事件
            @Override
            public void onClick(View view) {
                setDef(view);//设置默认
            }
        });
        linear_btn.addView(textDef);//把textDef添加到linear_btn中
        ListText_Def.add(textDef);//把textDef添加到索引中

        linearLayout.addView(linear_btn);//把linear_btn添加到外层linearLayout中
    }

    private void setDef(View view) {//设置默认
        //遍历索引里的所有TextView
        for (int i = 0; i < ListText_Def.size(); i++) {
            ListText_Def.get(i).setBackgroundColor(Color.argb(255, 52, 171, 139));
            ListText_Def.get(i).setText("设为默认");
            if (ListText_Def.get(i) == view) {
                view.setBackgroundColor(Color.argb(255, 171, 52, 56));
                ListText_Def.get(i).setText("默认");
            }
        }
    }

    private void delBtn(View view) {//动态删除按钮
        if (view == null) {
            return;
        }
        int position = -1;
        for (int i = 0; i < ListBtn_Show.size(); i++) {
            if (ListBtn_Show.get(i) == view) {
                position = i;
                break;
            }
        }
        if (position >= 0) {
            ListBtn_Show.remove(position);//从索引中移除被删除的Button
            ListText_Def.remove(position);//从索引中移除被删除的TextView
            linearLayout.removeViewAt(position + 1);//在外出linearLayout删除内部指定位置所有控件
        }
    }
}