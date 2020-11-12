package com.study;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.study.MVP.View.LoginActivity;
import com.study.activity.A11ListViewObject;
import com.study.activity.A12GridView;
import com.study.activity.A13DiyView;
import com.study.activity.A14FragmentActivity;
import com.study.activity.A15PlayerServiceActivity;
import com.study.activity.A15TestServiceActivity;
import com.study.activity.A16BottomTab;
import com.study.activity.A17ViewPagerTab;
import com.study.activity.A18TablayoutTab;
import com.study.activity.A19TabLayout;
import com.study.activity.A20UnitTVF;
import com.study.activity.A21Permission;
import com.study.activity.A22Dialog;
import com.study.activity.A23BroadcastActivity;
import com.study.activity.A24RecycleViewDecoration;
import com.study.activity.A24RecyclerViewShu;
import com.study.activity.A25ContentProvider;
import com.study.activity.A26Notification;
import com.study.activity.A27WebView;
import com.study.activity.A28OkHttp;
import com.study.activity.A29AsyncTaskActivity;
import com.study.activity.A30HandlerActivity;
import com.study.activity.a01_calculator;
import com.study.activity.a02_bigger;
import com.study.activity.a05_vibrate;
import com.study.activity.a06_pcMuscle;
import com.study.activity.a07_dynamicLayout;
import com.study.activity.a08_file;
import com.study.activity.a09_storage;
import com.study.activity.a11ListView;
import com.study.adapter.A24RVDecorationAdapter;
import com.study.download.DownloadActivity;
import com.study.retrofit.CaiyunRealtimeWeatherActivity;

public class FirstFragment extends Fragment {

    public FirstFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void onClickBtn(View b) {
        switch (b.getId()) {
            case R.id.cal: {
                Intent i = new Intent(getActivity(), a01_calculator.class);
                startActivity(i);
                break;
            }
            case R.id.bigger: {
                Intent i = new Intent(getActivity(), a02_bigger.class);
                startActivity(i);
                break;
            }
            case R.id.vibrate: {
                Intent i = new Intent(getActivity(), a05_vibrate.class);
                startActivity(i);
                break;
            }
        }
    }
}