package io.github.litwak913;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.IOException;
import java.util.List;



public class CFMirror {
    private static final Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);
    public void startMirror(String mode, boolean verbose, String dir) {
        if (verbose) {
            Configurator.setRootLevel(Level.ALL);
        }
        mirrorMods();
    }

    private void mirrorMods() {
        System.out.println("Start mirror mods");
        for (int i = 0; i < 100; i++)
            try {
                String jsonString = Http.doHttpRequest("api/v2/addon/search?gameId=432&index=" + 100 * i + "&pageSize=100&sort=1&sectionId=6");
                if (jsonString.equals("ERROR")) {
                    System.out.println("\033[31;4m" + "ERROR:Network Error" + "\033[0m");
                    System.exit(1);
                }
                System.out.println(jsonString);
                List<Mods> list = new Gson().fromJson(jsonString, new TypeToken<List<Mods>>() {
                }.getType());
                for (Mods v : list) {
                    System.out.println(v.getId());
                    System.out.println("Get file list");
                    String fileJsonString = Http.doHttpRequest("api/v2/addon/" + v.getId() + "/files");

                    List<ModsFiles> mflist = new Gson().fromJson(fileJsonString, new TypeToken<List<ModsFiles>>() {
                    }.getType());
                    for (ModsFiles mf : mflist) {
                        System.out.println(mf.getFileName());
                        System.out.println(mf.getDownloadUrl());
                    }
                }
            } catch (IOException e) {
                System.out.println("\033[31;4m" + "ERROR:" + e.getMessage() + "\033[0m");
                System.exit(1);
            }


    }
}
