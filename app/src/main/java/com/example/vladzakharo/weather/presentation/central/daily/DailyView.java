package com.example.vladzakharo.weather.presentation.central.daily;

import android.support.annotation.NonNull;

import com.example.vladzakharo.weather.presentation.common.mvp.MvpView;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public interface DailyView extends MvpView {

    String ARG_TEMPR = "ARG_TEMPR";
    String ARG_PRESS = "ARG_PRESS";
    String ARG_WIND = "ARG_WIND";

    void setImage();

    void setTemperature(@NonNull String text);

    void setPressure(@NonNull String text);

    void setWind(@NonNull String text);
}
