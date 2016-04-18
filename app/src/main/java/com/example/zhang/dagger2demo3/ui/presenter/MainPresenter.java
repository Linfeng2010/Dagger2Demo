package com.example.zhang.dagger2demo3.ui.presenter;

import com.example.zhang.dagger2demo3.di.component.DaggerMainPresenterComponent;
import com.example.zhang.dagger2demo3.di.module.MainPresenterModule;
import com.example.zhang.dagger2demo3.module.biz.MainBiz;
import com.example.zhang.dagger2demo3.ui.view.MainView;

import javax.inject.Inject;

/**
 * Created by zhang on 16-4-18.
 */
public class MainPresenter {

    @Inject
    MainView mMainView;
    @Inject
    MainBiz mMainBiz;

    public MainPresenter(MainView mainView)
    {
        DaggerMainPresenterComponent.builder()
                .mainPresenterModule(new MainPresenterModule(mainView))
                .build()
                .inject(this);
    }

    public void makeShowToast()
    {
        mMainView.showToast(mMainBiz.getToastMessage());
    }

}
