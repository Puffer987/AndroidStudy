package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;

import com.study.R;

public class A14FragmentActivity extends AppCompatActivity {

    private A14MyFragment myFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a14_fragment);

        int height, width;

        /*
         * 获取屏幕长宽
         */
        // Point size = new Point();
        // getWindowManager().getDefaultDisplay().getSize(size);
        // height = size.y;
        // width = size.x;

        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);
        height = metrics.heightPixels;
        width = metrics.widthPixels;

        if (width > height) {
            myFragment = new A14MyFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.fm_main, myFragment).commit();
            /* 上面一行等价于下面的
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.fm_main, f1).commit();
            还有remove add等方法
            */

        } else {
            // A14MyFragment f1 = new A14MyFragment();
            if (myFragment != null)
            getSupportFragmentManager().beginTransaction().hide(myFragment).commit();
        }


    }
}