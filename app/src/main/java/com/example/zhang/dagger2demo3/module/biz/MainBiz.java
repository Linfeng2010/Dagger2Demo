package com.example.zhang.dagger2demo3.module.biz;

import com.example.zhang.dagger2demo3.module.entity.MainBean;

/**
 * Created by zhang on 16-4-18.
 */
public class MainBiz {

    MainBean mMainBean;

    public MainBiz()
    {
        mMainBean = new MainBean();
        mMainBean.setMessage("依赖注入Success！");
    }

    public String getToastMessage()
    {
        return mMainBean.getMessage();
    }

}
