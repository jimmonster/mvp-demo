package com.hljt.zhbp12.ui.activity;

import android.os.SystemClock;

import com.hljt.zhbp12.R;
import com.hljt.zhbp12.api.Api;
import com.hljt.zhbp12.base.BaseActivity;
import com.hljt.zhbp12.presenter.BasePresenter;

import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;


/**
 * @author Administrator
 *
 * /**
 * @author :Jim
 * @date :2018/6/7
 * @description : 广告页面、 播放广告，短视频，实现跳转
 *
 */
public class SplashActivity extends BaseActivity {
    @Override
    public int initLayoutId() {
        return R.layout.activity_splash;
    }

    @Override
    protected BasePresenter initPresenter() {
        return null;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData(HashMap params) {
        ScheduledExecutorService scheduled=new ScheduledThreadPoolExecutor(2);
        scheduled.execute(new Runnable() {
            @Override
            public void run() {
                SystemClock.sleep(2000);
                Api.startActivity(MainActivity.class);
            }
        });

    }




}
