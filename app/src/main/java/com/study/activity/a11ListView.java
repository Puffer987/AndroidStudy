package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.study.R;
import com.study.adapter.a11LVadapter;

public class a11ListView extends AppCompatActivity {

    private ListView mLV;
    private com.study.adapter.a11LVadapter a11LVadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a11_list_view);


        mLV = findViewById(R.id.myListView);

        a11LVadapter = new a11LVadapter(a11ListView.this);
        mLV.setAdapter(a11LVadapter);

        mLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(a11ListView.this, "" + a11LVadapter.getItem(position), Toast.LENGTH_LONG).show();
            }
        });
    }
}