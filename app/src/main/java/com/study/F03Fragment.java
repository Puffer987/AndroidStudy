package com.study;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;

/**
 * @program: AndroidStudy
 * @description: 新建03
 * @author: Adolf
 * @create: 2020-07-07 17:41
 **/
public class F03Fragment extends Fragment {

    private View mView;
    private Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_03, container, false);
        return mView;
    }



}
