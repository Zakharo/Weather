package com.example.vladzakharo.weather.presentation.central;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.example.vladzakharo.weather.R;
import com.example.vladzakharo.weather.presentation.common.mvp.BaseMvpActivity;
import com.example.vladzakharo.weather.presentation.first.FirstFragment;
import com.example.vladzakharo.weather.presentation.second.SecondFragment;

public class CentralActivity extends BaseMvpActivity<CentralView, CentralPresenter>
        implements CentralView {

    private static final int COUNT_OF_FRAGMENTS = 2;

    private Toolbar toolbar;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);
        initView();
        getPresenter().attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    protected CentralPresenter createPresenter() {
        return new CentralPresenter();
    }

    private void initView() {
        initToolBar();
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
    }

    private void initToolBar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.menu_settings:
                break;
            case R.id.menu_quit:
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setupTitle(@NonNull String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private class MyPageAdapter extends FragmentPagerAdapter {

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FirstFragment.newInstance("17", "118", "9");
                case 1:
                    return SecondFragment.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            return COUNT_OF_FRAGMENTS;
        }
    }
}
