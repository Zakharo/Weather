package com.example.vladzakharo.weather.presentation.forecast;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.data.model.forecast.ForecastWeatherList;
import com.example.vladzakharo.weather.presentation.adapters.ForecastAdapter;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vlad Zakharo on 28.03.2017.
 */
public class ForecastFragment extends BaseMvpFragment<ForecastView, ForecastPresenter>
        implements ForecastView {

    @BindView(R.id.recyclerView)
    public RecyclerView recyclerView;

    private ForecastAdapter forecastAdapter;

    public ForecastFragment() {

    }

    public static ForecastFragment newInstance() {
        ForecastFragment fragment = new ForecastFragment();
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getPresenter().attachView(this);
    }

    @Override
    public void onStart() {
        super.onStart();
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
        return view;
    }

    @Override
    public void setList(ArrayList<ForecastWeatherList> list) {
        ArrayList<ForecastWeatherList> arrayList;
        arrayList = list;
        forecastAdapter = new ForecastAdapter(presenter, arrayList);
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(forecastAdapter);
    }
}
