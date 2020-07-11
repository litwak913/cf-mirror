package io.github.litwak913;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class Http {
    public static final String CF_URL = "https://addons-ecs.forgesvc.net/";

    public static String doHttpRequest(String extra) {
        Log log;
        String url = CF_URL + extra;
        int timeout = 60000;
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        String result = null;
        log = LogFactory.getLog(Http.class);
        try {
            httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(url);
            RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(timeout)
                    .setConnectionRequestTimeout(timeout)
                    .setSocketTimeout(timeout)
                    .build();
            httpGet.setConfig(requestConfig);
            response = httpClient.execute(httpGet);

            HttpEntity entity = response.getEntity();

            result = EntityUtils.toString(entity);
        } catch (IOException e) {
            log.error("Network Error", e);
        } finally {
            if (null != response) {
                try {
                    response.close();
                } catch (IOException e) {
                    log.error("Fatal Error", e);
                }
            }
            if (null != httpClient) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    log.error("Fatal Error", e);
                }
            }
        }
        return result;
    }
}
