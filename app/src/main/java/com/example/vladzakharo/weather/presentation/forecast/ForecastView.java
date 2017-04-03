package com.example.vladzakharo.weather.presentation.forecast;

import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherList;
import com.example.vladzakharo.weather.presentation.common.mvp.MvpView;

import java.util.ArrayList;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public interface ForecastView extends MvpView {
    void setList(ArrayList<ForecastWeatherList> list);
}
