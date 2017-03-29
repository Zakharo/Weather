package com.example.vladzakharo.weather.presentation.first;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.vladzakharo.weather.data.api.ServiceFactory;
import com.example.vladzakharo.weather.data.model.WeatherData;
import com.example.vladzakharo.weather.data.api.WeatherService;
import com.example.vladzakharo.weather.domain.CurrentWeatherInteractor;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

import static com.example.vladzakharo.weather.presentation.first.FirstView.ARG_PRESS;
import static com.example.vladzakharo.weather.presentation.first.FirstView.ARG_TEMPR;
import static com.example.vladzakharo.weather.presentation.first.FirstView.ARG_WIND;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */

public class FirstPresenter extends BaseMvpPresenter<FirstView> {

    private String temperature;
    private String pressure;
    private String wind;

    private CurrentWeatherInteractor currentWeatherInteractor;
    private CompositeDisposable compositeDisposable;

    FirstPresenter() {
        currentWeatherInteractor = new CurrentWeatherInteractor();
        compositeDisposable = new CompositeDisposable();
    }

    private void loadCurrentWeather() {
        compositeDisposable.add(currentWeatherInteractor.getWeatherByCityId("55")
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<WeatherData>() {
                               @Override
                               public void accept(WeatherData weatherData) throws Exception {
                                   FirstView view = getView();
                                   if (view != null) {
                                       view.setTemperature(String.valueOf(weatherData.getMain().getTemp()));
                                   }
                                   Log.d("WEATHER DATA", weatherData.getName());
                               }
                           }
                        , new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                Log.d("ERROR", throwable.getMessage());
                            }
                        }));
    }

    @Override
    public void attachView(final FirstView view) {
        super.attachView(view);
        loadCurrentWeather();
//        WeatherService service = ServiceFactory.createRetrofitService(WeatherService.class, WeatherService.SERVICE_ENDPOINT);
//        service.getWeatherData("627904", "4005952b6c9fd2dd34130a45724128ad")

    }

    @Override
    public void detachView() {
        super.detachView();
        compositeDisposable.dispose();
    }

    public void extractArguments(@Nullable Bundle bundle) {
        if (bundle != null) {
            temperature = bundle.getString(ARG_TEMPR, "");
            pressure = bundle.getString(ARG_PRESS, "");
            wind = bundle.getString(ARG_WIND, "");
            setValues();
        }
    }

    private void setValues() {
        FirstView view = getView();
        if (view != null) {
            view.setImage();
            view.setTemperature(temperature);
            view.setPressure(pressure);
            view.setWind(wind);
        }
    }
}
