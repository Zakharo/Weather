package com.example.vladzakharo.weather;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */

public abstract class MvpActivity<V extends MvpView, P extends MvpPresenter>
        extends AppCompatActivity implements MvpView {

    protected P presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = createPresenter();
    }

    protected abstract P createPresenter();
}
