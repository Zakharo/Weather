package com.example.vladzakharo.weather.domain;

import com.example.vladzakharo.weather.data.api.ServiceApi;
import com.example.vladzakharo.weather.data.api.ServiceFactory;
import com.example.vladzakharo.weather.data.api.WeatherService;
import com.example.vladzakharo.weather.data.model.Main;
import com.example.vladzakharo.weather.data.model.WeatherData;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;

/**
 * Created by Vlad Zakharo on 29.03.2017.
 */

public class CurrentWeatherInteractor {

    private WeatherService weatherService;

    public CurrentWeatherInteractor() {
        weatherService = ServiceFactory.createWeatherService();
    }

    public Observable<WeatherData> getWeatherByCityId(String cityId) {
//        WeatherData weatherData = new WeatherData();
//        Main main = new Main();
//        main.setTemperature(20);
//        weatherData.setMain(main);
        return weatherService.getWeatherData(cityId, "4005952b6c9fd2dd34130a45724128ad");
//        return Observable.just(weatherData);
    }
}
