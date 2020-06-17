package com.study;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.study.activity.A11ListViewObject;
import com.study.activity.A12GridView;
import com.study.activity.A13DiyView;
import com.study.activity.A14FragmentActivity;
import com.study.activity.A15BindServiceActivity;
import com.study.activity.A15PlayerServiceActivity;
import com.study.activity.A16BottomTab;
import com.study.activity.A17ViewPagerTab;
import com.study.activity.A18TablayoutTab;
import com.study.activity.A19TabLayout;
import com.study.activity.A20UnitTVF;
import com.study.activity.A21Permission;
import com.study.activity.A22Dialog;
import com.study.activity.a01_calculator;
import com.study.activity.a02_bigger;
import com.study.activity.a03_about;
import com.study.activity.a05_vibrate;
import com.study.activity.a06_pcMuscle;
import com.study.activity.a07_dynamicLayout;
import com.study.activity.a08_file;
import com.study.activity.a09_storage;
import com.study.activity.a11ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_about: {
                //这里添加启动“关于”界面的代码。
                Intent i = new Intent(this, a03_about.class);
                startActivity(i);
            }
            break;
        }
        return true;
    }

    public boolean onClickBtn(View b) {
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
                Intent i = new Intent(this, A15BindServiceActivity.class);
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
            } case R.id.permission: {
                Intent i = new Intent(this, A21Permission.class);
                startActivity(i);
                break;
            }case R.id.dialog: {
                Intent i = new Intent(this, A22Dialog.class);
                startActivity(i);
                break;
            }
        }
        return true;
    }
}