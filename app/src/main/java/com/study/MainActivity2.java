package com.study;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;
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
import com.study.activity.A31DiyInRectActivity;
import com.study.activity.a01_calculator;
import com.study.activity.a02_bigger;
import com.study.activity.a05_vibrate;
import com.study.activity.a06_pcMuscle;
import com.study.activity.a07_dynamicLayout;
import com.study.activity.a08_file;
import com.study.activity.a09_storage;
import com.study.activity.a11ListView;
import com.study.download.DownloadActivity;
import com.study.retrofit.CaiyunRealtimeWeatherActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ViewPager vp = findViewById(R.id.index_vp);
        TabLayout tb = findViewById(R.id.index_tab);
        tb.addTab(tb.newTab().setText("新"));
        tb.addTab(tb.newTab().setText("四大组件"));
        tb.addTab(tb.newTab().setText("其他"));

        List<Fragment> fragmentList = new ArrayList<>();

        fragmentList.add(new F03Fragment());
        fragmentList.add(new Boss4Fragment());
        fragmentList.add(new FirstFragment());

        IndexVPAdapter adapter = new IndexVPAdapter(getSupportFragmentManager(), fragmentList);
        vp.setAdapter(adapter);

        tb.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                vp.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                tb.getTabAt(position).select();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

    }

    public void onClickBtn(View b) {
        switch (b.getId()) {
            case R.id.cal: {
                Intent i = new Intent(this, a01_calculator.class);
                startActivity(i);
                break;
            }
            case R.id.bigger: {
                Intent i = new Intent(this, a02_bigger.class);
                startActivity(i);
                break;
            }
            case R.id.vibrate: {
                Intent i = new Intent(this, a05_vibrate.class);
                startActivity(i);
                break;
            }
            case R.id.pcMuscle: {
                Intent i = new Intent(this, a06_pcMuscle.class);
                startActivity(i);
                break;
            }
            case R.id.dynamicLayout: {
                Intent i = new Intent(this, a07_dynamicLayout.class);
                startActivity(i);
                break;
            }
            case R.id.file: {
                Intent i = new Intent(this, a08_file.class);
                startActivity(i);
                break;
            }
            case R.id.storage: {
                Intent i = new Intent(this, a09_storage.class);
                startActivity(i);
                break;
            }
            case R.id.list_view: {
                Intent i = new Intent(this, a11ListView.class);
                startActivity(i);
                break;
            }
            case R.id.list_view2: {
                Intent i = new Intent(this, A11ListViewObject.class);
                startActivity(i);
                break;
            }
            case R.id.grid_view: {
                Intent i = new Intent(this, A12GridView.class);
                startActivity(i);
                break;
            }
            case R.id.recycle_view1: {
                Intent i = new Intent(this, A24RecyclerViewShu.class);
                startActivity(i);
                break;
            }
            case R.id.recycle_view2: {
                Intent i = new Intent(this, A24RecyclerViewShu.class);
                startActivity(i);
                break;
            }
            case R.id.recycle_view3: {
                Intent i = new Intent(this, A24RecyclerViewShu.class);
                startActivity(i);
                break;
            }case R.id.rv_decoration: {
                Intent i = new Intent(this, A24RecycleViewDecoration.class);
                startActivity(i);
                break;
            }
            case R.id.diy_view: {
                Intent i = new Intent(this, A13DiyView.class);
                startActivity(i);
                break;
            }
            case R.id.fragment_test: {
                Intent i = new Intent(this, A14FragmentActivity.class);
                startActivity(i);
                break;
            }
            case R.id.tab_button: {
                Intent i = new Intent(this, A16BottomTab.class);
                startActivity(i);
                break;
            }
            case R.id.tab_viewpage: {
                Intent i = new Intent(this, A17ViewPagerTab.class);
                startActivity(i);
                break;
            }
            case R.id.tab_u3: {
                Intent i = new Intent(this, A20UnitTVF.class);
                startActivity(i);
                break;
            }
            case R.id.player_service: {
                Intent i = new Intent(this, A15PlayerServiceActivity.class);
                startActivity(i);
                break;
            }
            case R.id.bind_start_service: {
                Intent i = new Intent(this, A15TestServiceActivity.class);
                startActivity(i);
                break;
            }
            case R.id.tl_1: {
                Intent i = new Intent(this, A18TablayoutTab.class);
                startActivity(i);
                break;
            }
            case R.id.tl_2: {
                Intent i = new Intent(this, A19TabLayout.class);
                startActivity(i);
                break;
            }
            case R.id.permission: {
                Intent i = new Intent(this, A21Permission.class);
                startActivity(i);
                break;
            }
            case R.id.dialog: {
                Intent i = new Intent(this, A22Dialog.class);
                startActivity(i);
                break;
            }
            case R.id.broadcast: {
                Intent i = new Intent(this, A23BroadcastActivity.class);
                startActivity(i);
                break;
            }
            case R.id.mvp_login: {
                Intent i = new Intent(this, LoginActivity.class);
                startActivity(i);
                break;
            }
            case R.id.content_provider: {
                Intent i = new Intent(this, A25ContentProvider.class);
                startActivity(i);
                break;
            }
            case R.id.notification: {
                Intent i = new Intent(this, A26Notification.class);
                startActivity(i);
                break;
            }
            case R.id.web_view: {
                Intent i = new Intent(this, A27WebView.class);
                startActivity(i);
                break;
            }
            case R.id.ok_http: {
                Intent i = new Intent(this, A28OkHttp.class);
                startActivity(i);
                break;
            }
            case R.id.download_text: {
                Intent i = new Intent(this, DownloadActivity.class);
                startActivity(i);
                break;
            }
            case R.id.progress_async_task: {
                Intent i = new Intent(this, A29AsyncTaskActivity.class);
                startActivity(i);
                break;
            }
            case R.id.progress_handler: {
                Intent i = new Intent(this, A30HandlerActivity.class);
                startActivity(i);
                break;
            }
            case R.id.retrofit_caiyun: {
                Intent i = new Intent(this, CaiyunRealtimeWeatherActivity.class);
                startActivity(i);
                break;
            }
            case R.id.diy_in_rect: {
                Intent i = new Intent(this, A31DiyInRectActivity.class);
                startActivity(i);
                break;
            }
            default: {
                Toast.makeText(this, "没有配置", Toast.LENGTH_SHORT).show();
            }
        }


    }

}