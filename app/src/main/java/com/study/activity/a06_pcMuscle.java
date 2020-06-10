package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Service;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.study.R;

import java.util.regex.Pattern;

public class a06_pcMuscle extends AppCompatActivity {
    private Vibrator vib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a06_pc_muscle);

        vib = (Vibrator) getSystemService(Service.VIBRATOR_SERVICE);

    }


    public void vibCancel(View view) {
        vib.cancel();
    }

    public long[] str2long(String inStr, int loop) throws Exception {
        String sumStr = "";
        for (int i = 0; i < loop; i++) {
            sumStr = sumStr + " " + inStr;
        }

        String[] s = sumStr.trim().split(" ");
        long[] patten = new long[s.length];

        for (int i = 0; i < s.length; i++) {
            Pattern pattern = Pattern.compile("[0-9]*");
            boolean isNum = pattern.matcher(s[i]).matches();
            if (!isNum){
                throw new Exception();
            }
            patten[i] = Long.valueOf(s[i]);
        }

        return patten;
    }

    public void doTack(View view) {
        switch (view.getId()) {
            case R.id.vib_btn1: {
                EditText inputString = findViewById(R.id.vib_inStr1);
                String inStr = inputString.getText().toString();

                EditText loopString = findViewById(R.id.vib_loop1);
                int loop = Integer.parseInt(loopString.getText().toString());

                long[] patten ;
                try {
                    patten = str2long(inStr, loop);
                } catch (Exception e) {
                    Toast.makeText(a06_pcMuscle.this, "请输入正确格式", Toast.LENGTH_LONG).show();
                    return;
                }

                Toast.makeText(a06_pcMuscle.this, "输入：" + inStr + "\n循环：" + loop, Toast.LENGTH_LONG).show();
                vib.vibrate(patten, -1);
                break;
            }
        }

    }
}