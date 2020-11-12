package com.study;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

/**
 * @program: AndroidStudy
 * @description: adapt
 * @author: Adolf
 * @create: 2020-07-07 16:47
 **/
public class IndexVPAdapter extends FragmentPagerAdapter {

    List<Fragment> mFragmentList;

    public IndexVPAdapter(FragmentManager fm, List<Fragment> fragmentList){
        this(fm,0);
        this.mFragmentList = fragmentList;
    }

    public IndexVPAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
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
