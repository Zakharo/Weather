package com.example.vladzakharo.weather.presentation.central;

import android.support.annotation.Nullable;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpPresenter;

/**
 * Created by Vlad Zakharo on 27.03.2017.
 */
public class CentralPresenter extends BaseMvpPresenter<CentralView> {

    private void setTitle(String text) {
        CentralView view = getView();
        if (view != null) {
            getView().setupTitle(text);
        }
    }

    @Override
    public void attachView(final CentralView view) {
        super.attachView(view);
        setTitle("Hrodna");
    }

    @Override
    public void detachView() {
        super.detachView();
    }
}
