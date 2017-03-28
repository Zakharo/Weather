package com.example.vladzakharo.weather.presentation.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpFragment;


public class FirstFragment extends BaseMvpFragment<FirstView, FirstPresenter>
        implements FirstView {

    private static final String ARG_TEMPR = "ARG_TEMPR";
    private static final String ARG_PRESS = "ARG_PRESS";
    private static final String ARG_WIND = "ARG_WIND";

    private ImageView myImageView;
    private TextView myTemperatureTextView;
    private TextView myPressureTextView;
    private TextView myWindTextView;

    private String temperature;
    private String pressure;
    private String wind;

    public static FirstFragment newInstance(String tempr, String press, String wind) {
        FirstFragment fragment = new FirstFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEMPR, tempr);
        args.putString(ARG_PRESS, press);
        args.putString(ARG_WIND, wind);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().attachView(this);
    }

    @Override
    protected FirstPresenter createPresenter() {
        return new FirstPresenter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        initView(view);
        presenter.extractArguments();
        presenter.setTemperature(temperature);
        presenter.setWind(wind);
        presenter.setPressure(pressure);
        presenter.setImage();
        return view;
    }

    private void initView(View view) {
        myTemperatureTextView = (TextView) view.findViewById(R.id.fragment_one_tempr);
        myImageView = (ImageView) view.findViewById(R.id.fragment_one_image);
        myPressureTextView = (TextView) view.findViewById(R.id.fragment_one_press);
        myWindTextView = (TextView) view.findViewById(R.id.fragment_one_wind);
    }

    @Override
    public void setTemperature(String text) {
        myTemperatureTextView.setText(text + " C");
    }

    @Override
    public void setPressure(String text) {
        myPressureTextView.setText(text + " mm");
    }

    @Override
    public void setWind(String text) {
        myWindTextView.setText(text + " m/s");
    }

    @Override
    public void saveArguments() {
        if (getArguments() != null) {
            temperature = getArguments().getString(ARG_TEMPR, "");
            pressure = getArguments().getString(ARG_PRESS, "");
            wind = getArguments().getString(ARG_WIND, "");
        }
    }

    @Override
    public void setImage() {
        myImageView.setImageResource(R.mipmap.ic_launcher);
    }
}
