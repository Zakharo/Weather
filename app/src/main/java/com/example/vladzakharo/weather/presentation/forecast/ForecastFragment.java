package com.example.vladzakharo.weather.presentation.forecast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.Forecast;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherData;
import com.example.vladzakharo.weather.presentation.adapters.ForecastAdapter;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpFragment;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class ForecastFragment extends BaseMvpFragment<ForecastView, ForecastPresenter>
        implements ForecastView {

    @BindView(R.id.recycler_forecast)
    public RecyclerView recyclerView;

    private ForecastAdapter forecastAdapter;

    public static ForecastFragment newInstance() {
        return new ForecastFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().detachView();
    }

    @Override
    protected ForecastPresenter createPresenter() {
        return new ForecastPresenter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);
        ButterKnife.bind(this, view);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getPresenter().attachView(this);
    }

    @Override
    public void loadWeather(ForecastWeatherData data) {
        if (forecastAdapter == null) {
            forecastAdapter = new ForecastAdapter(data.getForecastList());
        } else {
            for (int i = 0; i < data.getForecastList().size(); i++) {
                addForecast(data.getForecastList().get(i));
            }
            return;
        }
        recyclerView.setAdapter(forecastAdapter);
    }

    private void addForecast(Forecast forecast) {
        forecastAdapter.addForecast(forecast);
    }
}
