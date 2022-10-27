package com.example.tugascallapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("activity")
    Call<Activities> getTypeActivity(@Query("type") String type);
}
