package com.hljt.zhbp12.api;

import android.content.Context;
import android.content.Intent;

import com.lzy.okgo.OkGo;

/**
 * @author : Jim
 * @date : 2018/6/7
 * @description :
 */
public  class Api extends android.app.Application{

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        OkGo.getInstance().init(this);
        mContext = this;

    }

    public  static  void startActivity(Class clazz){
        Intent intent=new Intent(mContext,clazz);
        mContext.startActivity(intent);
    }

}
