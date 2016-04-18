package com.example.zhang.dagger2demo3.di.component;

import com.example.zhang.dagger2demo3.di.module.MainBizModule;
import com.example.zhang.dagger2demo3.module.biz.MainBiz;

import dagger.Component;

/**
 * Created by zhang on 16-4-18.
 */
@Component(modules = MainBizModule.class)
public interface MainBizComponent {

    public void inject(MainBiz mainBiz);

}
