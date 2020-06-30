package com.study.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.study.fragment.MyFragment;

import java.util.List;

public class A20TVFAdapter extends FragmentPagerAdapter {

    private final List<MyFragment> mFragment;

    public A20TVFAdapter(@NonNull FragmentManager fm, int behavior, List<MyFragment> fragments) {
        super(fm, behavior);
        mFragment = fragments;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment.size();
    }
}
