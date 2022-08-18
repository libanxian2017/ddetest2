package com.centit;

import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class okhttpTest {
    public static void main(String[] args) {
        /*OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
        Request request1 = new Request.Builder().get().url("https://www.baidu.com").build();*/
        ClassPathXmlApplicationContext ca=new ClassPathXmlApplicationContext("applicationContext.xml");
        OkHttpClient okHttpClient = ca.getBean("okHttpClient", OkHttpClient.class);
        Request request = new Request.Builder()
                .get()
                .url("http://172.24.128.35/gzmh/#/login")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                System.out.println("e.getMessage()"+e.getMessage());
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                System.out.println("response.body().string()"+response.body().string());
            }
        });

    }

}
