package com.example.vladzakharo.weather.presentation.central;

import com.example.vladzakharo.weather.presentation.common.mvp.MvpView;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */

public interface CentralActivityView extends MvpView {
    void setupTitle(String title);

    void setupViewPager();
}
