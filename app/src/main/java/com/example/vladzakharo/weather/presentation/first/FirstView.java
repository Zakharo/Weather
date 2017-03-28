package com.example.vladzakharo.weather.presentation.first;

import com.example.vladzakharo.weather.presentation.common.mvp.MvpView;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */

public interface FirstView extends MvpView {

    void setImage();

    void setTemperature(String text);

    void setPressure(String text);

    void setWind(String text);

    void saveArguments();
}
