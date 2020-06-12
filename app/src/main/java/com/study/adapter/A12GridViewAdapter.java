package com.study.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.study.R;
import com.study.help.A12GVUser;

import java.util.List;

public class A12GridViewAdapter extends BaseAdapter implements View.OnClickListener {

    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<A12GVUser> mUserInfos;

    public A12GridViewAdapter(Context mContext) {
        this.mContext = mContext;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setmUserInfos(List<A12GVUser> mUserInfos) {
        this.mUserInfos = mUserInfos;
    }

    @Override
    public int getCount() {
        return mUserInfos.size();
    }

    @Override
    public Object getItem(int position) {
        return mUserInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = mLayoutInflater.inflate(R.layout.activity_a12_grid_view_item,null);
            viewHolder = new ViewHolder();
            viewHolder.avatar = convertView.findViewById(R.id.gv_item_img);
            viewHolder.name = convertView.findViewById(R.id.gv_item_text);
            viewHolder.btn = convertView.findViewById(R.id.gv_item_btn);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.avatar.setImageResource(R.mipmap.adolf_study);
        viewHolder.btn.setTag(R.id.tag_gv_btn,position);
        viewHolder.btn.setOnClickListener(this);
        viewHolder.name.setText(mUserInfos.get(position).getName());
        return convertView;
    }

    @Override
    public void onClick(View v) {
        int position = (int) v.getTag(R.id.tag_gv_btn);

        mUserInfos.remove(position);
        notifyDataSetChanged();
        Toast.makeText(mContext, "删除了"+position, Toast.LENGTH_SHORT).show();
    }

    private class ViewHolder {
        ImageView avatar ;
        TextView name;
        Button btn;
    }

}
