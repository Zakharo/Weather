package com.example.vladzakharo.weather.data.api;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */
public class ServiceFactory {

    public static WeatherService createWeatherService() {
        return RetrofitService.getInstance()
                .getRetrofitService()
                .create(WeatherService.class);
    }
}
