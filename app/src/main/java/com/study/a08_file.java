package com.study;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.study.help.SDFileHelper;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class a08_file extends AppCompatActivity implements View.OnClickListener{

    private EditText editname;
    private EditText editdetail;
    private Button btnsave;
    private Button btnclean;
    private Button btnread;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();
        bindViews();
    }

    private void bindViews() {
        editname = (EditText) findViewById(R.id.edittitle);
        editdetail = (EditText) findViewById(R.id.editdetail);
        btnsave = (Button) findViewById(R.id.btnsave);
        btnclean = (Button) findViewById(R.id.btnclean);
        btnread = (Button) findViewById(R.id.btnread);

        btnsave.setOnClickListener(this);
        btnclean.setOnClickListener(this);
        btnread.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnclean:
                editdetail.setText("");
                editname.setText("");
                break;
            case R.id.btnsave:
                String filename = editname.getText().toString();
                String filedetail = editdetail.getText().toString();
                SDFileHelper sdHelper = new SDFileHelper(mContext);
                try
                {
                    sdHelper.savaFileToSD(filename, filedetail);
                    Toast.makeText(getApplicationContext(), "数据写入成功", Toast.LENGTH_SHORT).show();
                }
                catch(Exception e){
                    e.printStackTrace();
                    Toast.makeText(getApplicationContext(), "数据写入失败", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btnread:
                String detail = "";
                SDFileHelper sdHelper2 = new SDFileHelper(mContext);
                try
                {
                    String filename2 = editname.getText().toString();
                    detail = sdHelper2.readFromSD(filename2);
                }
                catch(IOException e){e.printStackTrace();}
                Toast.makeText(getApplicationContext(), detail, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}