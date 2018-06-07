package com.hljt.zhbp12.ui.activity;

import com.hljt.zhbp12.R;
import com.hljt.zhbp12.base.BaseActivity;
import com.hljt.zhbp12.bean.MainBean;
import com.hljt.zhbp12.presenter.BasePresenter;
import com.hljt.zhbp12.presenter.MainPresenter;
import com.hljt.zhbp12.ui.activity.impl.IMainActivity;

import java.util.HashMap;

/**
 * @author : Jim
 * @date : 2018/6/7
 * @description :主页
 *
 */
public class MainActivity  extends BaseActivity implements IMainActivity {
    private MainPresenter mMainPresenter;
    @Override
    public int initLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter initPresenter() {
        mMainPresenter = new MainPresenter();
        return mMainPresenter;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData(HashMap params) {
        String url="";//todo 请求的网络地址
        //请求网络数据
        mMainPresenter.getResponse(url,params);
       // mMainPresenter.postResponse(url,params);
    }

    @Override
    public void testView(MainBean mainBean) {

    }
}
