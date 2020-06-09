package com.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class A11ListViewObject extends AppCompatActivity {
    private ListView mObjectListView;
    private List<A11UserInfo> mUserInfo = new ArrayList<>();
    private A11UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a11_list_view_object);

        mObjectListView = findViewById(R.id.object_list_view);

        mUserInfo.add(new A11UserInfo("Adolf",11));
        mUserInfo.add(new A11UserInfo("puffer",13));
        mUserInfo.add(new A11UserInfo("egg",14));
        userAdapter = new A11UserAdapter(A11ListViewObject.this, mUserInfo);
        mObjectListView.setAdapter(userAdapter);

        mObjectListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(A11ListViewObject.this, "click: "+mUserInfo.get(position).getUsername(),Toast.LENGTH_LONG).show();
            }
        });

        mObjectListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    mUserInfo.add(new A11UserInfo("我是新来的",15));
                    userAdapter.updateUserInfo(mUserInfo);
                    userAdapter.notifyDataSetChanged();
                    Toast.makeText(A11ListViewObject.this, "添加成功:...",Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });

    }

    public void addListViewItem(View view){
        mUserInfo.add(new A11UserInfo("我是新来的",15));
        userAdapter.updateUserInfo(mUserInfo);
        userAdapter.notifyDataSetChanged();
        Toast.makeText(A11ListViewObject.this, "添加成功:...",Toast.LENGTH_SHORT).show();
    }
}