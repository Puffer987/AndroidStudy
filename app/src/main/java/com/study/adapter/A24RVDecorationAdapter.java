package com.study.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.study.R;

/**
 * @program: AndroidStudy
 * @description:
 * @author: Adolf
 * @create: 2020-07-18 11:48
 **/
public class A24RVDecorationAdapter extends RecyclerView.Adapter<A24RVDecorationAdapter.ViewHolder> {

    String[] strings;

    public A24RVDecorationAdapter(String[] strings) {
        this.strings = strings;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_a24_rv_decoration, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(strings[position]);
        holder.subtitle.setText(strings[position]+"sub描述");
    }

    @Override
    public int getItemCount() {
        return strings.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView title, subtitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.i24_title);
            subtitle = itemView.findViewById(R.id.i24_subtitle);
        }
    }
}
