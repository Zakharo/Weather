package com.example.vladzakharo.weather.presentation.splash;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.example.vladzakharo.weather.presentation.second.SecondActivity;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpActivity;

public class SplashActivity extends BaseMvpActivity<SplashView, SplashPresenter> implements SplashView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter.attachView(this);
    }

    @Override
    protected SplashPresenter createPresenter() {
        return new SplashPresenter(new Handler());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    public void moveToHomeScreen() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();
    }
}
