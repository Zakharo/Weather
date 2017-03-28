package com.example.vladzakharo.weather.presentation.first;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

import static com.example.vladzakharo.weather.presentation.first.FirstView.ARG_PRESS;
import static com.example.vladzakharo.weather.presentation.first.FirstView.ARG_TEMPR;
import static com.example.vladzakharo.weather.presentation.first.FirstView.ARG_WIND;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */

public class FirstPresenter extends BaseMvpPresenter<FirstView> {

    private String temperature;
    private String pressure;
    private String wind;

    @Override
    public void attachView(final FirstView view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void extractArguments(@Nullable Bundle bundle) {
        if (bundle != null) {
            temperature = bundle.getString(ARG_TEMPR, "");
            pressure = bundle.getString(ARG_PRESS, "");
            wind = bundle.getString(ARG_WIND, "");
            setValues();
        }
    }

    private void setValues() {
        FirstView view = getView();
        if (view != null) {
            view.setImage();
            view.setTemperature(temperature);
            view.setPressure(pressure);
            view.setWind(wind);
        }
    }
}
