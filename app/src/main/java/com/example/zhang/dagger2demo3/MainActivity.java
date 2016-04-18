package com.example.zhang.dagger2demo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.example.zhang.dagger2demo3.di.component.DaggerMainActivityComponent;
import com.example.zhang.dagger2demo3.di.module.MainActivityModule;
import com.example.zhang.dagger2demo3.ui.presenter.MainPresenter;
import com.example.zhang.dagger2demo3.ui.view.MainView;
import com.example.zhang.dagger2demo3.utils.ToastHelper;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainView{

    @Bind(R.id.btn_main_showToast)
    Button btnMainShowToast;


    @Inject
    MainPresenter mMainPresenter;

    @Inject
    ToastHelper mToastHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        DaggerMainActivityComponent.builder()
                .mainActivityModule(new MainActivityModule(this))
                .build().inject(this);
    }

    @OnClick(R.id.btn_main_showToast)
    public void onCick()
    {
        mMainPresenter.makeShowToast();
    }


    @Override
    public void showToast(String message) {
        mToastHelper.showTost(message);
    }
}
