package com.example.vladzakharo.weather.data.api;

import com.example.vladzakharo.weather.data.model.daily.WeatherData;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherData;
import com.google.gson.annotations.SerializedName;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */
public interface WeatherService {

    @GET("weather")
    Observable<WeatherData> getWeather(@Query("units") String unit,
                                       @Query("id") String id,
                                       @Query("appid") String appid);

    @GET("forecast")
    Observable<ForecastWeatherData> getForecast(@Query("units") String unit,
                                                @Query("id") String id,
                                                @Query("appid")String appid);
}
