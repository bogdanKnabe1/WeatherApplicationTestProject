package com.example.weatherapp.Retrofit;

import retrofit2.Retrofit;
import retrofit2.Retrofit.Builder;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

// FULL link ==> http://api.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=e0a7d5bafc364e44614caa7a9341c22e

public class RetrofitClient {
    private static Retrofit instance;

    //Building and parsing json
    public static Retrofit getInstance(){
        if (instance == null)
            instance = new Retrofit.Builder()
                    .baseUrl("https://api.openweathermap.org/data/2.5/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build();
        return instance;
    }

}
