package com.example.vladzakharo.weather.domain;

import com.example.vladzakharo.weather.data.api.WeatherService;
import com.example.vladzakharo.weather.data.model.Main;
import com.example.vladzakharo.weather.data.model.WeatherData;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */

public class CurrentWeatherInteractor {
    public Observable<WeatherData> getWeatherByCityId(String cityId) {
        WeatherData weatherData = new WeatherData();
        Main main = new Main();
        main.setTemperature(20);
        weatherData.setMain(main);
        return Observable.just(weatherData);
    }
}
