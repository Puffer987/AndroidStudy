package com.study.retrofit.iciba;

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
import retrofit2.converter.gson.GsonConverterFactory;

public class IcibaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iciba);
    }

    public void translate(View view) {
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://fy.iciba.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // 创建接口实例
        IcibaService request = retrofit.create(IcibaService.class);

        Call<IcibaBeen> call = request.icibaTranslate();


        call.enqueue(new Callback<IcibaBeen>() {
            @Override
            public void onResponse(Call<IcibaBeen> call, Response<IcibaBeen> response) {
                response.body().toString();
            }

            @Override
            public void onFailure(Call<IcibaBeen> call, Throwable t) {
                Log.e("iciba", "onFailure: 连接失败" );
            }
        });
    }

}