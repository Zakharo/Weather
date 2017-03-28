package com.example.vladzakharo.weather.presentation.first;

import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */

public class FirstPresenter extends BaseMvpPresenter<FirstView> {

    @Override
    public void attachView(final FirstView view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void extractArguments() {
        FirstView view = getView();
        if (view != null) {
            getView().saveArguments();
        }
    }

    public void setTemperature(String text) {
        FirstView view = getView();
        if (view != null) {
            getView().setTemperature(text);
        }
    }

    public void setImage() {
        FirstView view = getView();
        if (view != null) {
            getView().setImage();
        }
    }

    public void setPressure(String text) {
        FirstView view = getView();
        if (view != null) {
            getView().setPressure(text);
        }
    }

    public void setWind(String text) {
        FirstView view = getView();
        if (view != null) {
            getView().setWind(text);
        }
    }
}
