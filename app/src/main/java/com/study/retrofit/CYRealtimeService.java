package com.study.retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CYRealtimeService {
    @GET("/v2.5/{token}/{longitude},{latitude}/realtime.jsonp")
    Call<CYRealtimeBean> realtime(@Path("token") String token, @Path("longitude") String longitude, @Path("latitude") String latitude);
}