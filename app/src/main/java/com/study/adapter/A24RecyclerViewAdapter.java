package com.study.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import com.study.R;
import com.study.help.A11UserInfo;

import java.util.List;

/**
 * @program: AndroidStudy
 * @description: adapter
 * @author: Adolf
 * @create: 2020-06-28 10:57
 **/
public class A24RecyclerViewAdapter extends RecyclerView.Adapter<A24RecyclerViewAdapter.ViewHolder> {

    private List<A11UserInfo> mUsers;

    public A24RecyclerViewAdapter(List<A11UserInfo> mUsers) {
        this.mUsers = mUsers;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_a24_recycler_view, parent, false);
        final ViewHolder holder = new ViewHolder(view);

        holder.age.setOnClickListener((View v)->{
            int position = holder.getAdapterPosition();
            Toast.makeText(v.getContext(), mUsers.get(position).getAge()+"",
                    Toast.LENGTH_SHORT).show();
        });
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Toast.makeText(v.getContext(), mUsers.get(position).getUsername(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.age.setText(mUsers.get(position).getAge() + "");
        holder.name.setText(mUsers.get(position).getUsername());
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView age;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.i24_name);
            age = itemView.findViewById(R.id.i24_text);
        }
    }
}
