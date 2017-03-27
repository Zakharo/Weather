package com.example.vladzakharo.weather.presentation.splash;

import android.os.Handler;
import android.support.annotation.NonNull;

import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */
public class SplashPresenter extends BaseMvpPresenter<SplashView> {

    private static final long SPLASH_DELAY_SEC = 3 * 1000;

    @NonNull
    private Handler mainHandler;

    SplashPresenter(@NonNull Handler mainHandler) {
        this.mainHandler = mainHandler;
    }

    @Override
    public void attachView(final SplashView view) {
        super.attachView(view);
        moveToHomeScreenWithDelay();
    }

    private void moveToHomeScreenWithDelay() {
        mainHandler.postDelayed(moveToHomeScreenRunnable, SPLASH_DELAY_SEC);
    }

    @Override
    public void detachView() {
        super.detachView();
        clearMainHandler();
    }

    private void clearMainHandler() {
        mainHandler.removeCallbacks(moveToHomeScreenRunnable);
    }

    private Runnable moveToHomeScreenRunnable = new Runnable() {
        @Override
        public void run() {
            SplashView view = getView();
            if (view != null) {
                view.moveToHomeScreen();
            }
        }
    };
}
