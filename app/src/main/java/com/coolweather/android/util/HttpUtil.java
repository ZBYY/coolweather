package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/2/23.
 * okHttp网络请求工具类
 */

public class HttpUtil {
    /**
     *请求地址address
     * 请求回调callback
     * @param address
     * @param callback
     */
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
