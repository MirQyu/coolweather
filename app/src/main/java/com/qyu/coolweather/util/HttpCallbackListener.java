package com.qyu.coolweather.util;

/**
 * Created by qyu on 2015/12/19.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
