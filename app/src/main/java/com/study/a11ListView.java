package com.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class a11ListView extends AppCompatActivity {

    private ListView mLV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a11_list_view);

        mLV = findViewById(R.id.myListView);

        a11LVadapter a11LVadapter = new a11LVadapter(a11ListView.this);
        mLV.setAdapter(a11LVadapter);
    }
}