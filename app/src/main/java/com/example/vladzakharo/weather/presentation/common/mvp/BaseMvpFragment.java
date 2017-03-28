package com.example.vladzakharo.weather.presentation.common.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public abstract class BaseMvpFragment<V extends MvpView, P extends MvpPresenter>
        extends Fragment implements MvpView {

    protected P presenter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
    }

    public P getPresenter() {
        return presenter;
    }

    protected abstract P createPresenter();
}
