package com.hljt.zhbp12.presenter;

import android.util.Log;

import com.hljt.zhbp12.bean.MainBean;
import com.hljt.zhbp12.model.MainModel;
import com.hljt.zhbp12.ui.activity.impl.IMainActivity;

/**
 * @author :  Jim
 * @date :  2018/6/7
 * @description : 主页的主持层， 负责主页和model之间的数据交互
 */
public class MainPresenter extends BasePresenter implements IMainActivity{
    MainModel MainModel=new MainModel();


    @Override
    public void testView(MainBean mainBean) {
        Log.d("MainPresenter", "将获取到的数据传回主页"+mainBean.getResult().getData().get(0).getAuthor_name());
    }

}
