package com.example.vladzakharo.weather.presentation.forecast;

import android.support.annotation.NonNull;

import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherData;
import com.example.vladzakharo.weather.domain.CurrentWeatherInteractor;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class ForecastPresenter extends BaseMvpPresenter<ForecastView> {

    private CompositeDisposable compositeDisposable;
    private CurrentWeatherInteractor currentWeatherInteractor;

    ForecastPresenter() {
        compositeDisposable = new CompositeDisposable();
        currentWeatherInteractor = new CurrentWeatherInteractor();
    }

    @Override
    public void attachView(ForecastView view) {
        super.attachView(view);
        loadForecast();
    }

    @Override
    public void detachView() {
        super.detachView();
        compositeDisposable.dispose();
        currentWeatherInteractor = null;
    }

    public void loadForecast() {
        compositeDisposable.add(currentWeatherInteractor.getForecastByCityId("627904")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ForecastWeatherData>() {
                    @Override
                    public void accept(ForecastWeatherData forecastWeatherData) throws Exception {
                        ForecastView view = getView();
                        if (view != null) {
                            view.setupRecyclerView(forecastWeatherData);
                        }
                    }
                }));
    }
}
