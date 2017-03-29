package com.example.vladzakharo.weather.presentation.first;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpFragment;

public class FirstFragment extends BaseMvpFragment<FirstView, FirstPresenter>
        implements FirstView {

    private ImageView imageView;
    private TextView temperatureView;
    private TextView pressureView;
    private TextView windView;
    private Button button;

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
        getPresenter().attachView(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPresenter().detachView();
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
        presenter.extractArguments(getArguments());
        return view;
    }

    private void initView(View view) {
        temperatureView = (TextView) view.findViewById(R.id.fragment_one_tempr);
        imageView = (ImageView) view.findViewById(R.id.fragment_one_image);
        pressureView = (TextView) view.findViewById(R.id.fragment_one_press);
        windView = (TextView) view.findViewById(R.id.fragment_one_wind);
        button = (Button) view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("**************", "Getting latitude");

            }
        });
    }

    @Override
    public void setTemperature(@NonNull String text) {
        if (!text.isEmpty()) {
            temperatureView.setText(text + " C");
        }
    }

    @Override
    public void setPressure(@NonNull String text) {
        if (!text.isEmpty()) {
            pressureView.setText(text + " mm");
        }
    }

    @Override
    public void setWind(@NonNull String text) {
        if (!text.isEmpty()) {
            windView.setText(text + " m/s");
        }
    }

    @Override
    public void setImage() {
        imageView.setImageResource(R.mipmap.ic_launcher);
    }
}
