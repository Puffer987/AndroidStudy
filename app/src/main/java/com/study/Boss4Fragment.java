package com.study;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.study.activity.a01_calculator;
import com.study.activity.a02_bigger;
import com.study.activity.a05_vibrate;

/**
 * @program: AndroidStudy
 * @description: 四大组件
 * @author: Adolf
 * @create: 2020-07-07 17:08
 **/
public class Boss4Fragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_boss4,container,false);
    }

}
