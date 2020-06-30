package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.study.R;
import com.study.adapter.A24RecyclerViewAdapter;
import com.study.help.A11UserInfo;

import java.util.ArrayList;
import java.util.List;

public class A24RecyclerViewShu extends AppCompatActivity {

    private List<A11UserInfo> userList;
    private LinearLayoutManager lLayoutManager;
    private GridLayoutManager gLayoutManager;
    private StaggeredGridLayoutManager sgLayoutManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a24_recycler_view_shu);
        initUsers();
        RecyclerView recyclerView = findViewById(R.id.i24_recycler_view);
        switch (4) {
            case 1:
                lLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
                recyclerView.setLayoutManager(lLayoutManager);
                break;
            case 2:
                lLayoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
                recyclerView.setLayoutManager(lLayoutManager);
                break;
            case 3:
                gLayoutManager = new GridLayoutManager(this, 3);
                recyclerView.setLayoutManager(gLayoutManager);
                break;
            case 4:
                sgLayoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(sgLayoutManager);
        }

        A24RecyclerViewAdapter adapter = new A24RecyclerViewAdapter(userList);
        recyclerView.setAdapter(adapter);
    }

    private void initUsers() {
        userList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            userList.add(new A11UserInfo("puffer", 222));
            userList.add(new A11UserInfo("adolf", 5555));
            userList.add(new A11UserInfo("jojo", 12));
            userList.add(new A11UserInfo("naruto", 23));
            userList.add(new A11UserInfo("uzumaki", 258893));
        }
    }
}