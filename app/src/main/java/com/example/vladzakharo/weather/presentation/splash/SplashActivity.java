package com.example.vladzakharo.weather.presentation.splash;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

import com.example.vladzakharo.weather.presentation.central.CentralActivity;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpActivity;

public class SplashActivity extends BaseMvpActivity<SplashView, SplashPresenter> implements SplashView{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().attachView(this);
    }

    @Override
    protected SplashPresenter createPresenter() {
        return new SplashPresenter(new Handler());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getPresenter().detachView();
    }

    @Override
    public void moveToHomeScreen() {
        Intent intent = new Intent(this, CentralActivity.class);
        startActivity(intent);
        finish();
    }
}
