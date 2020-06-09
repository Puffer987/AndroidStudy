package com.study;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class a11LVadapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private String[] mName ={"Adolf", "Puffer","Egg","猪猪"};
    public a11LVadapter(Context context) {
        this.mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {

        return mName.length; // 获取个数
    }

    @Override
    public Object getItem(int position) {
        return mName[position]; // 获取一个item
    }

    @Override
    public long getItemId(int position) {
        return position; // 获取item的id
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=mLayoutInflater.inflate(R.layout.activity_a11_item,null);
        TextView textView = convertView.findViewById(R.id.textViewItem);
        textView.setText(mName[position]);
        return convertView;
    }
}
