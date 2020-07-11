package io.github.litwak913;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.List;



public class CFMirror {
    private Log log;
    public void startMirror(String mode, boolean verbose, String dir) {
        log = LogFactory.getLog(CFMirror.class);
        log.info("Start mirror");
        mirrorMods();
    }

    private void mirrorMods() {
        System.out.println("Start mirror mods");
        for (int i = 0; i < 100; i++) {
            log.info("Downloading Mods index");
            String jsonString = Utility.doHttpRequest("api/v2/addon/search?gameId=432&index=" + 100 * i + "&pageSize=100&sort=1&sectionId=6");
            log.debug(jsonString);
            List<Mods> list = new Gson().fromJson(jsonString, new TypeToken<List<Mods>>() {
            }.getType());
            for (Mods v : list) {
                log.debug(v.getId());
                log.info("Get mod file list:" + v.getName());
                String fileJsonString = Utility.doHttpRequest("api/v2/addon/" + v.getId() + "/files");

                List<ModsFiles> mflist = new Gson().fromJson(fileJsonString, new TypeToken<List<ModsFiles>>() {
                }.getType());
                for (ModsFiles mf : mflist) {
                    log.debug(mf.getFileName());
                    log.debug(mf.getDownloadUrl());
                }
            }
        }


    }
}
