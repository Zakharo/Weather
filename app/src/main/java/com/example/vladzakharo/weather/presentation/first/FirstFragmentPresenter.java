package com.example.vladzakharo.weather.presentation.first;

import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */

public class FirstFragmentPresenter extends BaseMvpPresenter<FirstFragmentView> {

    FirstFragmentPresenter() {

    }

    @Override
    public void attachView(FirstFragmentView view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void setTemperature(String text) {
        if (text != null) {
            getView().setTemperature(text);
        }
    }

    public void setImage() {
        getView().setImage();
    }

    public void setPressure(String text) {
        getView().setPressure(text);
    }

    public void setWind(String text) {
        getView().setWind(text);
    }
}
