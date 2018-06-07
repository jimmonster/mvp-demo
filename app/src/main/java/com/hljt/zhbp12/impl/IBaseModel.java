package com.hljt.zhbp12.impl;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author : Jim
 * @date : 2018/6/7
 * @description :
 */
public interface IBaseModel extends Serializable {

    void GET(String url, HashMap params);
    void POST(String url, HashMap params);


}
