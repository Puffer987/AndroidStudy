package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.study.R;
import com.study.fragment.F18Item;

public class A19TabLayout extends AppCompatActivity {

    private TabLayout mTabLayout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a19_tab_layout);
        init1();
        init2();
        init3();
        init4();
        init5();
        init6();
    }

    private void init1() {
        mTabLayout1 = findViewById(R.id.i19_tab1);
        for (int i = 0; i < 6; i++) {
            mTabLayout1.addTab(mTabLayout1.newTab().setText("没有属性" + i));
        }
    }

    private void init2() {
        mTabLayout1 = findViewById(R.id.i19_tab2);
        for (int i = 0; i < 10; i++) {
            mTabLayout1.addTab(mTabLayout1.newTab().setText("滚动" + i));
        }
    }

    private void init3() {
        mTabLayout1 = findViewById(R.id.i19_tab3);
        for (int i = 0; i < 4; i++) {
            mTabLayout1.addTab(mTabLayout1.newTab().setText("文字颜色" + i));
        }
    }

    private void init4() {
        mTabLayout1 = findViewById(R.id.i19_tab4);
        mTabLayout1.addTab(mTabLayout1.newTab().setText("指示器"));
        mTabLayout1.addTab(mTabLayout1.newTab().setText("颜色"));
        mTabLayout1.addTab(mTabLayout1.newTab().setText("高度"));
        mTabLayout1.addTab(mTabLayout1.newTab().setText("不填满宽度"));
    }

    private void init5() {
        mTabLayout1 = findViewById(R.id.i19_tab5);
        mTabLayout1.addTab(mTabLayout1.newTab().setText("居中和背景"));
        mTabLayout1.addTab(mTabLayout1.newTab().setText("展示"));
        mTabLayout1.addTab(mTabLayout1.newTab().setText("效果"));
    }

    private void init6() {
        mTabLayout1 = findViewById(R.id.i19_tab6);
        mTabLayout1.addTab(mTabLayout1.newTab().setText("与fragment"));
        mTabLayout1.addTab(mTabLayout1.newTab().setText("相结合"));
        mTabLayout1.addTab(mTabLayout1.newTab().setText("切换内容显示"));

        final F18Item[] fragments = new F18Item[3];
        fragments[0] = F18Item.newInstance("1第一项", null);
        fragments[1] = F18Item.newInstance("第2二项", null);
        fragments[2] = F18Item.newInstance("第三3项", null);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.i19_frame, fragments[0])
                .add(R.id.i19_frame, fragments[1]).hide(fragments[1])
                .add(R.id.i19_frame, fragments[2]).hide(fragments[2])
                .commit();

        mTabLayout1.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0: {
                        getSupportFragmentManager().beginTransaction()
                                .hide(fragments[1]).hide(fragments[2]).show(fragments[0]).commit();
                        break;
                    }
                    case 1: {
                        getSupportFragmentManager().beginTransaction()
                                .hide(fragments[0]).hide(fragments[2]).show(fragments[1]).commit();
                        break;
                    }
                    case 2: {
                        getSupportFragmentManager().beginTransaction()
                                .hide(fragments[1]).hide(fragments[0]).show(fragments[2]).commit();
                        break;
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
    }
}