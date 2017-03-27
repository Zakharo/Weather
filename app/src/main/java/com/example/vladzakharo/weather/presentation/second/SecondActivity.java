package com.example.vladzakharo.weather.presentation.second;

import android.os.Bundle;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpActivity;

public class SecondActivity extends BaseMvpActivity<SecondActivityView, SecondActivityPresenter>
        implements SecondActivityView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        presenter.attachView(this);
    }

    @Override
    protected SecondActivityPresenter createPresenter() {
        return new SecondActivityPresenter(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }
}
