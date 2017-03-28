package com.example.vladzakharo.weather.presentation.common.mvp;

import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */
public abstract class BaseMvpPresenter<V extends MvpView> implements MvpPresenter<V> {

    private WeakReference<V> mvpView;

    @Override
    public void attachView(V view) {
        this.mvpView = new WeakReference<>(view);
    }

    @Override
    public void detachView() {
        if (mvpView != null) {
            mvpView.clear();
            mvpView = null;
        }
    }

    @Nullable
    public V getView() {
        if (mvpView != null) {
            return mvpView.get();
        } else {
            return null;
        }
    }
}
