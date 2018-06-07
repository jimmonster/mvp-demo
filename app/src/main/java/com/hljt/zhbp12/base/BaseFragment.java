package com.hljt.zhbp12.base;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hljt.zhbp12.impl.IBaseView;
import com.hljt.zhbp12.presenter.BasePresenter;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author: Jim
 * @date: 2018/6/7
 * @description:
 */
public abstract class BaseFragment<P extends BasePresenter,V extends IBaseView> extends Fragment {

    private Unbinder mUnbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate( initLayoutId(), null);
        mUnbinder = ButterKnife.bind(this, inflate);
        initPresenter();
        initView();
        initData();
        return inflate;


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
     */
    protected abstract void initData();


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }
}
