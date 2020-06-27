package io.github.litwak913;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Http {
    public static final String CF_URL="https://addons-ecs.forgesvc.net/";
    public static String doHttpRequest(String extra) throws IOException {
        OkHttpClient http=new OkHttpClient();
        Request request=new Request.Builder().get().url(CF_URL+extra).build();
        Response response=http.newCall(request).execute();
        if(response.isSuccessful()){
            return response.body().string();
        }
        return "ERROR";
    }
}
