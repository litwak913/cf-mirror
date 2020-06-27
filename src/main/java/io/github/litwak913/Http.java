package io.github.litwak913;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Http {
    public static final String CF_URL = "https://addons-ecs.forgesvc.net/";

    public static String doHttpRequest(String extra) throws IOException {
        OkHttpClient http = new OkHttpClient.Builder()
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.MINUTES)
                .build();

        Request request = new Request.Builder().get().url(CF_URL + extra).build();
        Response response = http.newCall(request).execute();
        if (response.isSuccessful()) {
            return response.body().string();
        }
        return "ERROR";
    }
}
