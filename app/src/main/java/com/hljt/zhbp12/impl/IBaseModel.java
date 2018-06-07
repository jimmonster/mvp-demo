package com.hljt.zhbp12.impl;

import com.lzy.okgo.model.Response;

import java.io.Serializable;

/**
 * @author : Jim
 * @date : 2018/6/7
 * @description :
 */
public interface IBaseModel extends Serializable {
    /**
     * 成功获取到数据
     * @param response
     */
    void onSuccessful(Response<String> response);

}
