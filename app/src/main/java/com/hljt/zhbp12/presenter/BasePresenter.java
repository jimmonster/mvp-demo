package com.hljt.zhbp12.presenter;


import android.util.Log;

import com.hljt.zhbp12.impl.IBaseView;
import com.hljt.zhbp12.model.BaseModel;
import com.hljt.zhbp12.model.MainModel;
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
public abstract class BasePresenter <V extends IBaseView,M extends BaseModel>{
    MainModel mMainModel=new MainModel();

    /**
     * 加载数据
     * @param url
     * @param params
     */
    public void getResponse(String url, HashMap<String, String> params) {
        OkGo.<String>get(url)
                .params(params)
                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)
                .cacheTime(3600 * 12)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        //加载成功，解析数据

                        mMainModel.onSuccessful(response);
                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        //加载错误，显示错误信息

                        Log.d("BasePresenter", "获取数据失败" + response.message());
                    }

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        super.onStart(request);
                        //开始加载，显示进度条


                    }
                });
    }


    /**
     * 加载数据
     * @param url
     * @param params
     */
    public void postResponse(String url, HashMap params) {

        OkGo.<String>post(url)
                .params(params)
                .cacheMode(CacheMode.FIRST_CACHE_THEN_REQUEST)
                .cacheTime(3600 * 12)
                .execute(new StringCallback() {
                    @Override
                    public void onSuccess(Response<String> response) {
                        //加载成功，解析数据
                        mMainModel.onSuccessful(response);

                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);
                        //加载错误，显示错误信息
                        Log.d("BasePresenter", "获取数据失败" + response.message());

                    }

                    @Override
                    public void onStart(Request<String, ? extends Request> request) {
                        super.onStart(request);
                        //开始加载，显示进度条

                    }
                });


    }
}
