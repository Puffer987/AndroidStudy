package com.study.help;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.study.activity.A29AsyncTaskActivity;

/**
 * @program: AndroidStudy
 * @description: AsyncTask测试
 * @author: Adolf
 * @create: 2020-07-02 10:43
 **/
public class AT29Progress extends AsyncTask<String, Integer, String> {

    private final A29AsyncTaskActivity.Callback mCallback;
    private ProgressDialog progress;
    private Context mContext;

    public AT29Progress(A29AsyncTaskActivity.Callback callback) {
        this.mCallback = callback;
        this.mContext = callback.getContext();
    }

    @Override
    protected void onPreExecute() {
        progress = new ProgressDialog(mContext);
        progress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progress.setMax(100);
        progress.show();
    }

    @Override
    protected String doInBackground(String... strings) {
        String text = strings[0];
        StringBuilder outStr = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            outStr.append(text).append(i+1).append("\n");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(i);
        }

        return outStr.toString();
    }

    @Override
    protected void onPostExecute(String s) {
        progress.dismiss();
        mCallback.setOut(s);
        Toast.makeText(mContext,"成功",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        progress.setProgress(values[0]);
    }

}
