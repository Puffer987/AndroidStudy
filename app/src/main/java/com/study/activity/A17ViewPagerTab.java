package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.study.R;
import com.study.adapter.A17ViewPagerAdapter;
import com.study.view.F17TextFragment;

import java.util.ArrayList;
import java.util.List;

public class A17ViewPagerTab extends AppCompatActivity {

    private ViewPager mViewPager;
    private List<Fragment> mFragmentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a17_view_pager_tab);
        initView();
    }

    private void initView() {
        mViewPager = findViewById(R.id.i17_viewpager);
        mFragmentList = new ArrayList<>();

        F17TextFragment f1 = new F17TextFragment();
        Bundle bundle = new Bundle();
        bundle.putString("title","我是第一的");
        f1.setArguments(bundle);
        mFragmentList.add(f1);

        F17TextFragment f2 = new F17TextFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("title","不,我才是");
        f2.setArguments(bundle2);
        mFragmentList.add(f2);

        mFragmentList.add(F17TextFragment.newInstance("使用newInstance"));

        mFragmentList.add(new F17TextFragment());

        mViewPager.setAdapter(new A17ViewPagerAdapter(getSupportFragmentManager(), 1, mFragmentList));
    }
}