package com.example.vladzakharo.weather.domain;

import com.example.vladzakharo.weather.BuildConfig;
import com.example.vladzakharo.weather.data.api.ServiceFactory;
import com.example.vladzakharo.weather.data.api.WeatherService;
import com.example.vladzakharo.weather.data.model.daily.WeatherData;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherData;

import io.reactivex.Observable;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */
public class CurrentWeatherInteractor {

    private WeatherService weatherService;

    public CurrentWeatherInteractor() {
        weatherService = ServiceFactory.createWeatherService();
    }

    public Observable<WeatherData> getWeatherByCityId(String cityId) {
        return weatherService.getWeatherData(cityId, BuildConfig.API_KEY);
    }

    public Observable<ForecastWeatherData> getForecastByCityId(String cityId) {
        return weatherService.getForecastData(cityId, BuildConfig.API_KEY);
    }
}
