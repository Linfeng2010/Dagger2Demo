package com.example.zhang.dagger2demo3.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by zhang on 16-4-18.
 */
public class ToastHelper {
    Toast mToast;
    Context context;

    public ToastHelper(Context context)
    {
        this.context = context;
    }

    public void showTost(String message)
    {
        if(mToast == null)
        {
            mToast = Toast.makeText(this.context,message,Toast.LENGTH_SHORT);
        }else
        {
            mToast.setText(message);
        }
        mToast.show();
    }
}
