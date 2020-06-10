package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

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

        mGridView = findViewById(R.id.my_grid_view);

        viewAdapter = new A12GridViewAdapter(A12GridView.this);

        viewAdapter.setmUserInfos(initUserInfo());

        mGridView.setAdapter(viewAdapter);

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