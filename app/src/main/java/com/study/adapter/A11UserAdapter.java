package com.study.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.study.help.A11UserInfo;
import com.study.R;

import java.util.List;

public class A11UserAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mLayoutInflater;
    private List<A11UserInfo> userInfos;

    public A11UserAdapter(Context mContext, List<A11UserInfo> userInfos) {
        this.mContext = mContext;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.userInfos = userInfos;
    }

    @Override
    public int getCount() {
        return userInfos.size();
    }

    @Override
    public Object getItem(int position) {
        return userInfos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = mLayoutInflater.inflate(R.layout.activity_a11_list_view_object_item, null);
            viewHolder = new ViewHolder();
            viewHolder.name = convertView.findViewById(R.id.tvi_name);
            viewHolder.age = convertView.findViewById(R.id.tvi_age);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.name.setText(userInfos.get(position).getUsername());
        viewHolder.age.setText(userInfos.get(position).getAge() + "");
        return convertView;
    }

    class ViewHolder {
        TextView name;
        TextView age;
    }

    public void updateUserInfo(List<A11UserInfo> newUserInfo) {
        this.userInfos = newUserInfo;
    }
}
