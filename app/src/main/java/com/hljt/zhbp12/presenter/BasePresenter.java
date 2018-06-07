package com.hljt.zhbp12.presenter;


import com.hljt.zhbp12.impl.IBaseView;
import com.hljt.zhbp12.model.BaseModel;

import java.util.HashMap;

/**
 * @author: Jim
 * @date: 2018/6/7
 * @description:
 */
public abstract class BasePresenter <V extends IBaseView,M extends BaseModel>{
    BaseModel mBaseModel;

    /**
     * 加载数据
     * @param url
     * @param params
     */
    public void getResponse(String url, HashMap<String, String> params) {
        mBaseModel.GET(url,params);

    }


    /**
     * 加载数据
     * @param url
     * @param params
     */
    public void postResponse(String url, HashMap params) {
        mBaseModel.POST(url,params);

    }
}
