package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.study.R;
import com.study.help.A18DataGenerator;

public class A18TablayoutTab extends AppCompatActivity {
    private TabLayout mTabLayout;
    private Fragment []mFragmensts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a18_tablayout_tab);
        String[] strs = new String[]{"首页","发现","关注","我的"};
        mFragmensts = A18DataGenerator.getFragments(strs);

        initView();

    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.bottom_tab_layout);

        mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                onTabItemSelected(tab.getPosition());

                //改变Tab 状态
                for (int i = 0; i < mTabLayout.getTabCount(); i++) {
                    if (i == tab.getPosition()) {
                        // mTabLayout.getTabAt(i).setIcon(getResources().getDrawable(A18DataGenerator.mTabResPressed[i]));
                    } else {
                        // mTabLayout.getTabAt(i).setIcon(getResources().getDrawable(A18DataGenerator.mTabRes[i]));
                    }
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        mTabLayout.addTab(mTabLayout.newTab().setText(A18DataGenerator.mTabTitle[0]));
        mTabLayout.addTab(mTabLayout.newTab().setText(A18DataGenerator.mTabTitle[1]));
        mTabLayout.addTab(mTabLayout.newTab().setText(A18DataGenerator.mTabTitle[2]));
        mTabLayout.addTab(mTabLayout.newTab().setText(A18DataGenerator.mTabTitle[3]));

    }

    private void onTabItemSelected(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = mFragmensts[0];
                break;
            case 1:
                fragment = mFragmensts[1];
                break;

            case 2:
                fragment = mFragmensts[2];
                break;
            case 3:
                fragment = mFragmensts[3];
                break;
        }
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.home_container, fragment).commit();
        }
    }

}