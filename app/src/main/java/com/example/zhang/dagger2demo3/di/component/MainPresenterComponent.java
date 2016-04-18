package com.example.zhang.dagger2demo3.di.component;

import com.example.zhang.dagger2demo3.di.module.MainPresenterModule;
import com.example.zhang.dagger2demo3.ui.presenter.MainPresenter;

import dagger.Component;

/**
 * Created by zhang on 16-4-18.
 */
@Component(modules = MainPresenterModule.class)
public interface MainPresenterComponent {

    public void inject(MainPresenter mainPresenter);

}
