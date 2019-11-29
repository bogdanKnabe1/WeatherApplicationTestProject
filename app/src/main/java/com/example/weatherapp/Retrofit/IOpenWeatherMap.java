package com.example.weatherapp.Retrofit;



import com.example.weatherapp.Model.ForecastResult;
import com.example.weatherapp.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLatLng(@Query("lat") String lat,
                                                 @Query("lon") String lng,
                                                 @Query("appid") String appid,
                                                 @Query("units") String unit);

    @GET("forecast")
    Observable<ForecastResult> getForecastByLatLng(@Query("lat") String lat,
                                                   @Query("lon") String lng,
                                                   @Query("appid") String appid,
                                                   @Query("units") String unit);

}