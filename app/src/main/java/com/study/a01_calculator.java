package com.study;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.javia.arity.Symbols;
import org.javia.arity.SyntaxException;

public class a01_calculator extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a01_calculator);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_0:
            case R.id.btn_1:
            case R.id.btn_2:
            case R.id.btn_3:
            case R.id.btn_4:
            case R.id.btn_5:
            case R.id.btn_6:
            case R.id.btn_7:
            case R.id.btn_8:
            case R.id.btn_9:
            case R.id.btn_jia:
            case R.id.btn_jian:
            case R.id.btn_cheng:
            case R.id.btn_chu:
            case R.id.btn_dot:
            case R.id.btn_baifen: {
                Button btn = (Button) v;
                String addStr = btn.getText().toString();
                TextView formula = findViewById(R.id.formula);
                String orgStr = formula.getText().toString();
                String newStr = orgStr + addStr;
                formula.setText(newStr);
                break;
            }
            case R.id.btn_del: {
                TextView formula = findViewById(R.id.formula);
                String orgStr = formula.getText().toString();
                if (orgStr != "") {
                    String newStr = orgStr.substring(0, orgStr.length() - 1);
                    formula.setText(newStr);
                }
                break;
            }
            case R.id.btn_c: {
                TextView formula = findViewById(R.id.formula);
                formula.setText("");
                break;
            }
            case R.id.btn_comfirm: {
                TextView formula = findViewById(R.id.formula);
                String calStr = formula.getText().toString();
                try {
                    Symbols s = new Symbols();
                    double res = s.eval(calStr);
                    TextView result = findViewById(R.id.result);
                    result.setText(res + "");
                    // 动画效果
                    Animation fadeIn = AnimationUtils.loadAnimation(a01_calculator.this, R.anim.fade_in);
                    result.startAnimation(fadeIn);

                    formula.setText("");


                    Animation fadeOut = AnimationUtils.loadAnimation(a01_calculator.this, R.anim.fade_out);
                    formula.startAnimation(fadeOut);
                    // 监听动作formula被置空时
                    fadeOut.setAnimationListener(new Animation.AnimationListener() {

                        @Override//当动画开始时调用
                        public void onAnimationStart(Animation animation) {

                        }

                        @Override//当动画结束时调用
                        public void onAnimationEnd(Animation animation) {
                            TextView formula = (TextView) findViewById(R.id.formula);
                            formula.setText("");
                        }

                        @Override//当动画重复时调用
                        public void onAnimationRepeat(Animation animation) {

                        }
                    });
                } catch (SyntaxException e) {
                    Toast.makeText(a01_calculator.this, "错误！", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
                break;
            }

        }
    }
}