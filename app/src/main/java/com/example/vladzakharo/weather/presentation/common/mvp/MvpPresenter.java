package com.example.vladzakharo.weather.presentation.common.mvp;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */
public interface MvpPresenter<V extends MvpView> {

    void attachView(V view);

    void detachView();
}
