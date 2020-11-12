package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.study.R;
import com.study.adapter.A24RVDecorationAdapter;
import com.study.help.A24ItemDecoration;
import com.study.help.A24ItemDecorationGroup;

public class A24RecycleViewDecoration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a24_recycle_view_decoration);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        RecyclerView recyclerView = findViewById(R.id.i24_rv_decoration);
        recyclerView.setLayoutManager(layoutManager);

        String[] strings = new String[]
                {"aa", "ab", "a2", "a3",
                        "bb", "b2",
                        "cc", "c4",
                        "dd", "dog",
                        "eeee", "eat", "e4", "e6"
                };
        A24RVDecorationAdapter adapter = new A24RVDecorationAdapter(strings);

        recyclerView.setAdapter(adapter);

        // recyclerView.addItemDecoration(new A24ItemDecoration());

        recyclerView.addItemDecoration(new A24ItemDecorationGroup(this, new A24ItemDecorationGroup.DecorationCallback() {
            @Override
            public long getGroupId(int position) {
                return Character.toUpperCase(strings[position].charAt(0));
            }

            @Override
            public String getGroupFirstLine(int position) {
                return strings[position].substring(0, 1).toUpperCase();
            }
        }));
    }
}