package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.study.R;
import com.study.adapter.A20TVFAdapter;
import com.study.fragment.MyFragment;

import java.util.ArrayList;
import java.util.List;

public class A20UnitTVF extends AppCompatActivity {

    private List<MyFragment> mFragments;
    private ViewPager mViewPager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a20_unit_t_v_f);
        init();
    }

    private void init(){
        mFragments = new ArrayList<>();
        mFragments.add(MyFragment.newInstance("首页"));
        mFragments.add(MyFragment.newInstance("消息"));
        mFragments.add(MyFragment.newInstance("个人中心"));


        mTabLayout = findViewById(R.id.i20_tab);
        mTabLayout.addTab(mTabLayout.newTab().setText("首页"));
        mTabLayout.addTab(mTabLayout.newTab().setText("消息"));
        mTabLayout.addTab(mTabLayout.newTab().setText("个人中心"));

        mViewPager = findViewById(R.id.i20_content);
        mViewPager.setAdapter(new A20TVFAdapter(getSupportFragmentManager(),0,mFragments));


        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mViewPager.setCurrentItem(tab.getPosition());
                // 不要切换动画
                // mViewPager.setCurrentItem(tab.getPosition(),false);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                mTabLayout.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}