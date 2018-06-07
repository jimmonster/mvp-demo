package com.hljt.zhbp12.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hljt.zhbp12.impl.IBaseView;
import com.hljt.zhbp12.presenter.BasePresenter;

import java.util.HashMap;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author jim
 */
public abstract class BaseActivity<P extends BasePresenter,V extends IBaseView> extends AppCompatActivity {

    private Unbinder mUnbinder;
    HashMap<String, String> params ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayoutId());
        initPresenter();
        // bind the view using butterknife
        mUnbinder = ButterKnife.bind(this);

        //创建请求网络的参数
        if (params != null) {
            params.clear();
        }else{
            params = new HashMap<>();
        }
        initData(params);
        initView();
    }

    /**
     * 添加布局文件id
     * @return 布局文件id
     */
    public abstract int initLayoutId() ;
    /**
     * 加载presenter
     * @return presenter
     */
    protected abstract BasePresenter initPresenter();


    /**
     * 添加视图
     */
    protected abstract void initView();

    /**
     * 加载数据
     * @param params
     */
    protected abstract void initData(HashMap<String, String> params);


    @Override
    protected void onDestroy() {
        super.onDestroy();
        mUnbinder.unbind();
    }
}
