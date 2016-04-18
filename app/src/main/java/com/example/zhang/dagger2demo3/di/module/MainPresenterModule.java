package com.example.zhang.dagger2demo3.di.module;

import com.example.zhang.dagger2demo3.module.biz.MainBiz;
import com.example.zhang.dagger2demo3.ui.view.MainView;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhang on 16-4-18.
 */
@Module
public class MainPresenterModule {

    MainView mMainView;
    MainBiz mMainBiz;

    public MainPresenterModule(MainView mainView)
    {
        mMainView = mainView;
        mMainBiz = new MainBiz();
    }

    @Provides
    public MainBiz providesMainBiz()
    {
        return mMainBiz;
    }

    @Provides MainView providesMainView()
    {
        return mMainView;
    }



}
