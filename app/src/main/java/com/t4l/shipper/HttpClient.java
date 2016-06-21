package com.t4l.shipper;

import android.util.Log;

import com.loopj.android.http.*;
/**
 * Created by HOME on 6/17/2016.
 */
public class HttpClient {
    private static final String BASE_URL = "http://192.168.1.102";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        Log.d("HttpClient", BASE_URL + "/" + relativeUrl);
        return BASE_URL + "/" + relativeUrl;
    }
}
