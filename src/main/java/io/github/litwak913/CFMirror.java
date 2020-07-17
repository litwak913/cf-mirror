package io.github.litwak913;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class CFMirror {
    private Log log;

    public void startMirror(String dir) {
        log = LogFactory.getLog(CFMirror.class);
        log.info("Start mirror");
        mirrorMods(dir);
    }

    private void mirrorMods(String dir) {
        File file = new File(dir);
        FileWriter fw = null;

        if (!file.exists() && !file.isDirectory()) {
            log.info("Create directory:" + dir);
            file.mkdirs();
        }
        log.info("Start mirror mods");
        for (int i = 0; i < 100; i++) {
            log.info("Downloading Mods index");
            String jsonString = Utility.doHttpRequest("api/v2/addon/search?gameId=432&index=" + 100 * i + "&pageSize=100&sort=1&sectionId=6");

            log.debug(jsonString);

            List<Mods> list = new Gson().fromJson(jsonString, new TypeToken<List<Mods>>() {
            }.getType());
            for (Mods v : list) {
                File modDataFile = new File(dir + v.getSlug() + ".txt");

                try {
                        file.createNewFile();
                        log.info("create file:" + file.getName());
                        fw = new FileWriter(file);
                        Utility.writeModInfoData(fw, v.getName());
                    } catch (IOException e) {
                        Utility.crashAndExit("Fatal Error", e, log);
                    }

                log.debug(v.getId());
                log.info("Get mod file list:" + v.getName());
                String fileJsonString = Utility.doHttpRequest("api/v2/addon/" + v.getId() + "/files");

                List<ModsFiles> mflist = new Gson().fromJson(fileJsonString, new TypeToken<List<ModsFiles>>() {
                }.getType());
                for (ModsFiles mf : mflist) {
                    log.debug(mf.getFileName());
                    log.debug(mf.getDownloadUrl());

                    try {
                            Utility.writeModFileData(fw, mf.getFileName(), mf.getDownloadUrl(), mf.getFileLength());
                        } catch (IOException e) {
                            Utility.crashAndExit("Fatal Error", e, log);
                        }


                }
                try {
                    fw.close();
                } catch (IOException e) {
                    Utility.crashAndExit("Fatal Error", e, log);
                }
            }
        }
        log.info("ALL DONE");
        System.exit(0);

    }
}
