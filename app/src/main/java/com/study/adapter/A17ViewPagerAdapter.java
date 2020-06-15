package com.study.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class A17ViewPagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> mFragmentList;

    public A17ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        this(fm, behavior, null);
    }
    public A17ViewPagerAdapter(@NonNull FragmentManager fm, int behavior, List<Fragment> fragmentList) {
        super(fm, behavior);
        mFragmentList = fragmentList;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
