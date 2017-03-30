package com.example.vladzakharo.weather.presentation.second;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpFragment;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class SecondFragment extends BaseMvpFragment<SecondView, SecondPresenter>
        implements SecondView {

    public SecondFragment() {

    }

    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attachView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    protected SecondPresenter createPresenter() {
        return new SecondPresenter();
    }
}
