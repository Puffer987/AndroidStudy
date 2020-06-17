package com.study.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.study.MainActivity;
import com.study.R;

import java.util.ArrayList;

public class A22Dialog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a22_dialog);
    }

    public void normal(View view) {
        AlertDialog.Builder normalDialog = new AlertDialog.Builder(this);
        normalDialog.setIcon(R.mipmap.adolf_study);
        normalDialog.setTitle("我是一个普通Dialog");
        normalDialog.setMessage("让我来看看你选择了哪个..");
        normalDialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(A22Dialog.this, "你点击了确定", Toast.LENGTH_SHORT).show();
            }
        });
        normalDialog.setNegativeButton("关闭", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(A22Dialog.this, "你点击来了关闭", Toast.LENGTH_SHORT).show();
            }
        });
        // 显示
        normalDialog.show();
    }

    public void multiBtn(View view) {
        AlertDialog.Builder normalDialog = new AlertDialog.Builder(this);
        normalDialog.setIcon(R.mipmap.adolf_study);
        normalDialog.setTitle("我是一个普通Dialog");
        normalDialog.setMessage("让我来看看你选择了哪个..");
        normalDialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(A22Dialog.this, "你点击了确定", Toast.LENGTH_SHORT).show();
            }
        });
        normalDialog.setNeutralButton("中立", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(A22Dialog.this, "你点击了中立", Toast.LENGTH_SHORT).show();
            }
        });
        normalDialog.setNegativeButton("关闭", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(A22Dialog.this, "你点击了关闭", Toast.LENGTH_SHORT).show();
            }
        });

        // 显示
        normalDialog.show();
    }

    public void listDialog(View view) {
        final String[] items = {"item1", "item2", "item3", "item4"};
        AlertDialog.Builder listDialog = new AlertDialog.Builder(this);
        listDialog.setTitle("列表对话框");
        listDialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // which 下标从0开始
                Toast.makeText(A22Dialog.this, "你点击了" + items[which], Toast.LENGTH_SHORT).show();
            }
        });
        listDialog.show();
    }

    int flag;

    public void selDialog(View view) {
        final String[] items = {"selection1", "selection2", "selection3", "selection4"};
        flag = -1;
        AlertDialog.Builder singleChoiceDialog = new AlertDialog.Builder(this);
        singleChoiceDialog.setTitle("单选对话框");
        // 第二个参数是默认选项，此处设置为0
        singleChoiceDialog.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                flag = which;
            }
        });
        singleChoiceDialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if (flag != -1) {
                    Toast.makeText(A22Dialog.this, "你选择了" + items[flag], Toast.LENGTH_SHORT).show();
                }
            }
        });
        singleChoiceDialog.show();
    }

    ArrayList<Integer> yourChoices = new ArrayList<>();

    public void multiChoice(View view) {
        final String[] items = {"我是1", "我是2", "我是3", "我是4"};
        // 设置默认选中的选项，全为false默认均未选中
        final boolean initChoiceSets[] = {false, false, false, false};
        yourChoices.clear();
        AlertDialog.Builder multiChoiceDialog = new AlertDialog.Builder(this);
        multiChoiceDialog.setTitle("我是一个多选Dialog");
        multiChoiceDialog.setMultiChoiceItems(items, initChoiceSets, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                if (isChecked) {
                    yourChoices.add(which);
                } else {
                    yourChoices.remove(which);
                }
            }
        });
        multiChoiceDialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                int size = yourChoices.size();
                String str = "";
                for (int i = 0; i < size; i++) {
                    str += items[yourChoices.get(i)] + " ";
                }
                Toast.makeText(A22Dialog.this, "你选中了" + str, Toast.LENGTH_SHORT).show();
            }
        });
        multiChoiceDialog.show();
    }

    public void waiting(View view) {
        /* 等待Dialog具有屏蔽其他控件的交互能力
         * @setCancelable 为使屏幕不可点击，设置为不可取消(false)
         * 下载等事件完成后，主动调用函数关闭该Dialog
         */
        final ProgressDialog waitingDialog = new ProgressDialog(this);
        waitingDialog.setTitle("我是一个等待Dialog");
        waitingDialog.setMessage("等待中...5s后关闭");
        waitingDialog.setIndeterminate(true);
        waitingDialog.setCancelable(false);
        waitingDialog.show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    waitingDialog.dismiss();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    public void progress(View view) {
        /* @setProgress 设置初始进度
         * @setProgressStyle 设置样式（水平进度条）
         * @setMax 设置进度最大值
         */
        final int MAX_PROGRESS = 100;
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setProgress(0);
        progressDialog.setTitle("我是一个进度条Dialog");
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setMax(MAX_PROGRESS);
        progressDialog.show();
        /* 模拟进度增加的过程
         * 新开一个线程，每个100ms，进度增加1
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                int progress = 0;
                while (progress < MAX_PROGRESS) {
                    try {
                        Thread.sleep(100);
                        progress++;
                        progressDialog.setProgress(progress);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                // 进度达到最大值后，窗口消失
                progressDialog.cancel();
            }
        }).start();
    }

    public void input(View view) {
        /*@setView 装入一个EditView
         */
        final EditText editText = new EditText(this);
        AlertDialog.Builder inputDialog = new AlertDialog.Builder(this);
        inputDialog.setTitle("我是一个输入Dialog").setView(editText);
        inputDialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(A22Dialog.this, editText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        }).show();
    }

    /* 复写Builder的create和show函数，可以在Dialog显示前实现必要设置
     * 例如初始化列表、默认选项等
     * @create 第一次创建时调用
     * @show 每次显示时调用
     * show先于create
     */
    public void initDialog(View view) {
        AlertDialog.Builder dialog = new AlertDialog.Builder(this) {
            @Override
            public AlertDialog create() {
                Log.i("初始化","创建时");
                Toast.makeText(A22Dialog.this, "创建中", Toast.LENGTH_SHORT).show();
                return super.create();
            }

            @Override
            public AlertDialog show() {
                Log.i("初始化","展示时");
                Toast.makeText(A22Dialog.this, "展示中", Toast.LENGTH_SHORT).show();
                return super.show();
            }
        };
        dialog.setTitle("我是一个Dialog");
        dialog.setMessage("测试初始化操作");
        dialog.setPositiveButton("好的",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        /* @setOnDismissListener Dialog销毁时调用
         * @setOnCancelListener Dialog关闭时调用
         */
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialog) {
                Toast.makeText(getApplicationContext(), "Dialog被销毁了", Toast.LENGTH_SHORT).show();
            }
        });
        dialog.show();
    }
}