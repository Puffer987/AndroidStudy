package com.study.retrofit.iciba;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IcibaService {
    @GET("ajax.php?a=fy&f=auto&t=auto&w=i%20am%20happy")
    Call<IcibaBeen> icibaTranslate();
}
