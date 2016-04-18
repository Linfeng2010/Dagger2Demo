package com.example.zhang.dagger2demo3.di.module;

import com.example.zhang.dagger2demo3.MainActivity;
import com.example.zhang.dagger2demo3.ui.presenter.MainPresenter;
import com.example.zhang.dagger2demo3.ui.view.MainView;
import com.example.zhang.dagger2demo3.utils.ToastHelper;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhang on 16-4-18.
 */
@Module
public class MainActivityModule {

    MainPresenter mMainPresenter;
    ToastHelper mToastHelper;

    public MainActivityModule(MainView mainView)
    {
        mMainPresenter = new MainPresenter(mainView);
        mToastHelper = new ToastHelper(((MainActivity) mainView));
    }

    @Provides
    public MainPresenter providesPresenter()
    {
        return mMainPresenter;
    }

    @Provides
    public ToastHelper providesToastHelper()
    {
        return mToastHelper;
    }

}
