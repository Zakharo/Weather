package com.example.vladzakharo.weather.presentation.second;

import android.support.annotation.Nullable;

import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */

public class SecondActivityPresenter extends BaseMvpPresenter<SecondActivityView>
        implements SecondActivityView {

    private SecondActivityView view;

    public SecondActivityPresenter(SecondActivityView view) {
        this.view = view;
    }

    @Override
    public void attachView(SecondActivityView view) {
        super.attachView(view);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    @Nullable
    @Override
    public SecondActivityView getView() {
        return super.getView();
    }
}
