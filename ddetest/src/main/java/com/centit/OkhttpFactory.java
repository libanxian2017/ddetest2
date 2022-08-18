package com.centit;

import okhttp3.OkHttpClient;

public class OkhttpFactory {
    private OkHttpClient okHttpClient;
    public OkHttpClient getInstance() {
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient.Builder().build();
        }
        return okHttpClient;
    }
}
