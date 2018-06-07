package com.hljt.zhbp12.model;


import com.hljt.zhbp12.impl.IBaseModel;
import com.hljt.zhbp12.presenter.BasePresenter;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;
import com.lzy.okgo.request.base.Request;

import java.util.HashMap;

/**
 * @author: Jim
 * @date: 2018/6/7
 * @description:
 */
public  class BaseModel <P extends BasePresenter>implements IBaseModel {


    @Override
    public void GET(String url, HashMap params) {
        OkGo.<String>get(url)
                .params(params)
                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)
                .cacheTime(3600 * 12)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        //加载成功，解析数据


                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        //加载错误，显示错误信息


                    }

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        super.onStart(request);
                        //开始加载，显示进度条


                    }
                });

    }




    @Override
    public void POST(String url, HashMap params) {
        OkGo.<String>post(url)
                .params(params)
                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)
                .cacheTime(3600 * 12)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        //加载成功，解析数据


                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        //加载错误，显示错误信息

                    }

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        super.onStart(request);
                        //开始加载，显示进度条

                    }
                });
    }

}
