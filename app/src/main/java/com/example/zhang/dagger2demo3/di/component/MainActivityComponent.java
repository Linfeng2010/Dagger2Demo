package com.example.zhang.dagger2demo3.di.component;

import com.example.zhang.dagger2demo3.MainActivity;
import com.example.zhang.dagger2demo3.di.module.MainActivityModule;

import dagger.Component;

/**
 * Created by zhang on 16-4-18.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    public void inject(MainActivity mainActivity);

}
