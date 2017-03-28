package com.example.vladzakharo.weather.presentation.central;

import android.support.annotation.NonNull;

import com.example.vladzakharo.weather.presentation.common.mvp.MvpView;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */

public interface CentralView extends MvpView {

    void setupTitle(@NonNull String title);
}
