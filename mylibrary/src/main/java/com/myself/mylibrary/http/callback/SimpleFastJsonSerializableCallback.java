package com.myself.mylibrary.http.callback;

import com.myself.mylibrary.BasicApplication;
import com.myself.mylibrary.util.Logger;
import com.myself.mylibrary.util.StringUtils;
import com.myself.mylibrary.util.ToastUtils;
import com.myself.mylibrary.view.LoadingHUD;

import java.io.Serializable;

/**
 * 简单封装FastJsonSerializableCallback(反射方法获取泛型类型)
 * Created by guchenkai on 2016/1/19.
 */
public abstract class SimpleFastJsonSerializableCallback<T extends Serializable> extends FastJsonSerializableCallback<T> {
    private LoadingHUD loading;

    public SimpleFastJsonSerializableCallback(LoadingHUD loading) {
        super();
        this.loading = loading;
    }

    @Override
    public void onStart() {
        loading.show();
    }

    @Override
    public void onCacheSuccess(String url, T result) {

    }

    @Override
    public void onFailure(String url, int statusCode, String msg) {
        Logger.e("请求错误:url=" + url + ",statusCode=" + statusCode + ",错误信息=" + msg);
        if (!StringUtils.isEmpty(msg) && statusCode != -200)
            ToastUtils.showToastLong(BasicApplication.getInstance(), msg);
        if (loading != null) loading.dismiss();
    }

    @Override
    public void onFinish(String url, boolean isSuccess, String msg) {
        if (!isSuccess)
            Logger.w("服务器消息:" + msg);
        if (loading != null) loading.dismiss();
    }
}
