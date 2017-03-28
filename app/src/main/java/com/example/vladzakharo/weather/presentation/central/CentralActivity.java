package com.example.vladzakharo.weather.presentation.central;

import android.os.Bundle;
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

public class CentralActivity extends BaseMvpActivity<CentralActivityView, CentralActivityPresenter>
        implements CentralActivityView{

    private Toolbar toolbar;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central);
        presenter.attachView(this);
        initView();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.detachView();
    }

    @Override
    protected CentralActivityPresenter createPresenter() {
        return new CentralActivityPresenter();
    }

    private void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        presenter.setupPager();
        presenter.setTitle("Hrodna");
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
    public void setupTitle(String title) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(title);
    }

    @Override
    public void setupViewPager() {
        viewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
    }

    private class MyPageAdapter extends FragmentPagerAdapter {

        public MyPageAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: return FirstFragment.newInstance("17", "118", "9");
                case 1: return SecondFragment.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
