package io.github.litwak913;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Utility {
    public static final String CF_URL = "https://addons-ecs.forgesvc.net/";

    public static String doHttpRequest(String extra) {
        Log log;

        String url = CF_URL + extra;
        int timeout = 60000;
        CloseableHttpClient httpClient = null;
        CloseableHttpResponse response = null;
        String result = null;
        log = LogFactory.getLog(Utility.class);
        for (int i = 0; i == 2; i++) {
            try {
                httpClient = HttpClients.createDefault();
                HttpGet httpGet = new HttpGet(url);
                RequestConfig requestConfig = RequestConfig.custom().setConnectTimeout(timeout)
                        .setConnectionRequestTimeout(timeout)
                        .setSocketTimeout(timeout)
                        .build();
                httpGet.setConfig(requestConfig);
                response = httpClient.execute(httpGet);
                if (response.getStatusLine().getStatusCode() != 200) {
                    log.error("Network Error, Try Again:" + (i + 1));

                }
                if (response.getStatusLine().getStatusCode() == 200) {
                    HttpEntity entity = response.getEntity();
                    result = EntityUtils.toString(entity);

                }
            } catch (IOException e) {
                log.error("Network Error, Try Again:" + (i + 1), e);
            } finally {
                if (result == null) {
                    log.error("Network Error, Try Again:" + (i + 1));
                }
                if (result != null) {

                    if (null != response) {
                        try {
                            response.close();
                        } catch (IOException e) {
                            Utility.crashAndExit("Fatal Error", e, log);
                        }
                    }
                    if (null != httpClient) {
                        try {
                            httpClient.close();
                        } catch (IOException e) {
                            Utility.crashAndExit("Fatal Error", e, log);
                        }
                    }
                    break;
                }


            }
        }
        return result;
    }

    public static List<ModsFiles> encodeModFileListJson(String modInfoData) {
        return new Gson().fromJson(modInfoData, new TypeToken<List<ModsFiles>>() {
        }.getType());
    }

    public static List<Mods> encodeModInfoJson(String modInfoData) {
        return new Gson().fromJson(modInfoData, new TypeToken<List<Mods>>() {
        }.getType());
    }

    public static void writeModFileData(FileWriter fw, ModsFiles mf) throws IOException {
        fw.write("FileName:" + mf.getFileName());
        fw.write("FileLength:" + mf.getFileLength());
        fw.write("DownloadUrl:" + mf.getDownloadUrl());
    }

    public static void writeModInfoData(FileWriter fw, Mods m) throws IOException {
        fw.write("ModName:" + m.getName());
    }

    public static void crashAndExit(String info, Throwable e, Log log) {
        log.error(info, e);
        System.exit(1);
    }

    public static String getSize(int size) {
        if (size < 1024) {
            return size + "B";
        } else {
            size = size / 1024;
        }
        if (size < 1024) {
            return size + "KB";
        } else {
            size = size / 1024;
        }
        if (size < 1024) {
            size = size * 100;
            return size / 100 + "." + size % 100 + "MB";
        } else {
            size = size * 100 / 1024;
            return size / 100 + "." + size % 100 + "GB";
        }
    }
}
