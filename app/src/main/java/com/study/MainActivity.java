package com.study;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

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
            case R.id.dym2: {
                Intent i = new Intent(this, a10_dymaticView.class);
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
        }
        return true;
    }
}