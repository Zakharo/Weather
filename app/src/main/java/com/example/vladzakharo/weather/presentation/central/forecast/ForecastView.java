package com.example.vladzakharo.weather.presentation.central.forecast;

import com.example.vladzakharo.weather.data.model.forecast.Forecast;
import com.example.vladzakharo.weather.presentation.common.mvp.MvpView;

import java.util.List;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public interface ForecastView extends MvpView {

    void setWeather(List<Forecast> forecasts);
}
