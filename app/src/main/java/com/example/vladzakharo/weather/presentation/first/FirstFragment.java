package com.example.vladzakharo.weather.presentation.first;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpFragment;


public class FirstFragment extends BaseMvpFragment<FirstFragmentView, FirstFragmentPresenter>
        implements FirstFragmentView{

    private static final String ARG_TEMPR = "are_tempr";
    private static final String ARG_PRESS = "arg_press";
    private static final String ARG_WIND = "arg_wind";

    private ImageView ivImage;
    private TextView tvTemperature;
    private TextView tvPressure;
    private TextView tvWind;

    public FirstFragment() {

    }

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
        presenter.attachView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    protected FirstFragmentPresenter createPresenter() {
        return new FirstFragmentPresenter();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);
        initView(view);
        presenter.setTemperature(getArguments().getString(ARG_TEMPR, ""));
        presenter.setWind(getArguments().getString(ARG_WIND, ""));
        presenter.setPressure(getArguments().getString(ARG_PRESS, ""));
        presenter.setImage();
        return view;
    }

    private void initView(View view) {
        tvTemperature = (TextView) view.findViewById(R.id.fragment_one_tempr);
        ivImage = (ImageView) view.findViewById(R.id.fragment_one_image);
        tvPressure = (TextView) view.findViewById(R.id.fragment_one_press);
        tvWind = (TextView) view.findViewById(R.id.fragment_one_wind);
    }

    @Override
    public void setTemperature(String text) {
        tvTemperature.setText(text + " C");
    }

    @Override
    public void setPressure(String text) {
        tvPressure.setText(text + " mm");
    }

    @Override
    public void setWind(String text) {
        tvWind.setText(text + " m/s");
    }

    @Override
    public void setImage() {
        ivImage.setImageResource(R.mipmap.ic_launcher);
    }
}
