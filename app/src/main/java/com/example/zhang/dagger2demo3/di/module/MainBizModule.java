package com.example.zhang.dagger2demo3.di.module;

import com.example.zhang.dagger2demo3.module.entity.MainBean;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zhang on 16-4-18.
 */
@Module
public class MainBizModule {
    MainBean mMainBean;
    public void MainBizModule()
    {
        mMainBean = new MainBean();
    }

    @Provides
    public MainBean providesMainBean()
    {
        return mMainBean;
    }
}
