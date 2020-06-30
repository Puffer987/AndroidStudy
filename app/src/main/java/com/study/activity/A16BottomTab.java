package com.study.activity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.study.R;
import com.study.fragment.F16IHomeFragment;
import com.study.fragment.F16IndexFragment;

public class A16BottomTab extends AppCompatActivity {

    // private Fragment mIhome;
    // private Fragment mIndex;
    private F16IHomeFragment mIhomeFragment;
    private F16IndexFragment mIndexFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a16_bottom_tab);
        //
        FragmentTransaction mFt = getSupportFragmentManager().beginTransaction();
        mIndexFragment = new F16IndexFragment();
        mFt.add(R.id.i16_tab_fragment, mIndexFragment);

        mFt.commit();
    }

    public void index(View view) {
        FragmentTransaction mFt = getSupportFragmentManager().beginTransaction();
        if (mIhomeFragment!=null){
            mFt.hide(mIhomeFragment);
        }

        mFt.show(mIndexFragment).commit();
    }

    public void ihome(View view) {
        FragmentTransaction mFt = getSupportFragmentManager().beginTransaction();
        if (mIndexFragment != null) {
            mFt.hide(mIndexFragment);
        }
        if (mIhomeFragment == null) {
            mIhomeFragment = new F16IHomeFragment();
            mFt.add(R.id.i16_tab_fragment, mIhomeFragment);
        } else {
            mFt.show(mIhomeFragment);
        }
        mFt.commit();
    }

    // private void switchFragment(Fragment fragment) {
    //     if (fragment != mTempFragment) {
    //         if (!fragment.isAdded()) {
    //             getFragmentManager().beginTransaction().hide(mTempFragment)
    //                     .add(R.id.container, fragment).commit();
    //         } else {
    //             getFragmentManager().beginTransaction().hide(mTempFragment)
    //                     .show(fragment).commit();
    //         }
    //         mTempFragment = fragment;
    //     }
    // }
}
