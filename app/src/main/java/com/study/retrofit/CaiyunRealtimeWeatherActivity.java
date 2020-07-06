package com.study.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.study.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.converter.gson.GsonConverterFactory;

public class CaiyunRealtimeWeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caiyun_realtime_weather);
    }

    public void getWeather(View view) {
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("https://api.caiyunapp.com")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                CYRealtimeService rtService = retrofit.create(CYRealtimeService.class);
                Call<CYRealtimeBean> call = rtService
                        .realtime("jvNubvFi8U8lhVpg","113.3247","22.2337");
                call.enqueue(new Callback<CYRealtimeBean>() {
                    @Override
                    public void onResponse(Call<CYRealtimeBean> call, Response<CYRealtimeBean> response) {
                        CYRealtimeBean resp = response.body();
                        Log.i("422", resp.toString());
                    }

                    @Override
                    public void onFailure(Call<CYRealtimeBean> call, Throwable t) {

                    }
                });
            }
        }).start();


    }

}