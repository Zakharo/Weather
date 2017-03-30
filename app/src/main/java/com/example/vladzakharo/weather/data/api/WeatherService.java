package com.example.vladzakharo.weather.data.api;

import com.example.vladzakharo.weather.data.model.WeatherData;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */
public interface WeatherService {

    @GET("weather")
    Observable<WeatherData> getWeatherData(@Query("id") String id,
                                           @Query("appid") String appid);
}
