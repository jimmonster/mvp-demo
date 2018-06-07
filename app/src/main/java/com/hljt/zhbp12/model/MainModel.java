package com.hljt.zhbp12.model;

import android.util.Log;

import com.google.gson.reflect.TypeToken;
import com.hljt.zhbp12.bean.MainBean;
import com.hljt.zhbp12.impl.IBaseModel;
import com.hljt.zhbp12.presenter.MainPresenter;
import com.lzy.okgo.model.Response;

/**
 * @author :  Jim
 * @date :  2018/6/7
 * @description :
 */
public class MainModel extends BaseModel implements IBaseModel{

    MainPresenter mMainPresenter;


    public MainPresenter getMainPresenter() {
        return mMainPresenter;
    }

    @Override
    public void onSuccessful(Response<String> response) {
        Log.d("BaseModel", "获取到数据："+response.body());
        java.lang.reflect.Type type = new TypeToken<MainBean>() {}.getType();
        MainBean  mainBean = mGson.fromJson(response.body(), type);

        mMainPresenter.testView(mainBean);
    }
}
