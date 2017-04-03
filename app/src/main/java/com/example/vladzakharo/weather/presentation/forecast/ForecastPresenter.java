package com.example.vladzakharo.weather.presentation.forecast;

import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherData;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherList;
import com.example.vladzakharo.weather.domain.CurrentWeatherInteractor;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

import java.util.ArrayList;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class ForecastPresenter extends BaseMvpPresenter<ForecastView> {

    private ArrayList<ForecastWeatherList> list;
    private CompositeDisposable compositeDisposable;
    private CurrentWeatherInteractor currentWeatherInteractor;

    ForecastPresenter() {
        compositeDisposable = new CompositeDisposable();
        currentWeatherInteractor = new CurrentWeatherInteractor();
    }

    @Override
    public void attachView(ForecastView view) {
        super.attachView(view);
        getList();
    }

    @Override
    public void detachView() {
        super.detachView();
        currentWeatherInteractor = null;
        compositeDisposable.dispose();
    }

    public void getList() {
        compositeDisposable.add(currentWeatherInteractor.getForecastByCityId("627904")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ForecastWeatherData>() {
                    @Override
                    public void accept(ForecastWeatherData forecastWeatherData) throws Exception {
                        list = forecastWeatherData.getList();
                        ForecastView view = getView();
                        if (view != null) {
                            view.setList(list);
                        }
                    }
                }));
    }
}
