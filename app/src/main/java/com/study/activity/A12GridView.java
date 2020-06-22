package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.study.R;
import com.study.adapter.A12GridViewAdapter;
import com.study.help.A12GVUser;


import java.util.ArrayList;
import java.util.List;

public class A12GridView extends AppCompatActivity {

    private GridView mGridView;
    private final List<A12GVUser> mUsers = new ArrayList<>();
    private A12GridViewAdapter viewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a12_grid_view);

        LayoutInflater layoutInflater;
        // LayoutInflater layoutInflater = getLayoutInflater();
        // layoutInflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        layoutInflater = LayoutInflater.from(A12GridView.this);
        layoutInflater.inflate(R.layout.activity_main,null);

        mGridView = findViewById(R.id.my_grid_view);

        viewAdapter = new A12GridViewAdapter(A12GridView.this);

        viewAdapter.setmUserInfos(initUserInfo());

        mGridView.setAdapter(viewAdapter);

        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(A12GridView.this, "我点击Item：" + position, Toast.LENGTH_SHORT).show();
            }
        });
        mGridView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(A12GridView.this, "长按了Item："+position, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    public List<A12GVUser> initUserInfo() {
        mUsers.add(new A12GVUser("Adolf"));
        mUsers.add(new A12GVUser("Puffer"));
        mUsers.add(new A12GVUser("小米"));
        mUsers.add(new A12GVUser("小红"));
        mUsers.add(new A12GVUser("小明"));
        mUsers.add(new A12GVUser("李华"));

        return mUsers;
    }

    public void addItem(View view) {
        mUsers.add(new A12GVUser("新同学" + (mUsers.size() + 1)));
        viewAdapter.setmUserInfos(mUsers);
        viewAdapter.notifyDataSetChanged();
    }


}