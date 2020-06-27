package io.github.litwak913;

import com.google.gson.Gson;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CFMirror {

    private String jsonString;
    private String fileJsonString;

    public void startMirror(String[] mirror, String mode, boolean verbose, String dir) {

        if (mirror[0].equals("mods")) {
            mirrorMods();
            if (mirror.length == 2) {
                if (mirror[1].equals("modpacks")) {
                    mirrorModpacks();
                }
            }
        }
        if (mirror[0].equals("modpacks")) {
            mirrorModpacks();
            if (mirror.length == 2) {
                if (mirror[1].equals("mods")) {
                    mirrorMods();
                }
            }
        }
    }

    private void mirrorModpacks() {

    }

    private void mirrorMods() {
        System.out.println("Start mirror mods");
        for (int i = 0; i < 100; i++)
            try {
                jsonString = Http.doHttpRequest("api/v2/addon/search?gameId=432&index=" + 1 * i + "&pageSize=2&sort=1&sectionId=6");
                if (jsonString .equals( "ERROR")) {
                    System.out.println("\033[31;4m" + "ERROR:Network Error" + "\033[0m");
                    System.exit(1);
                }
                System.out.println(jsonString);
                Gson gson = new Gson();
                Type type = new TypeToken<ArrayList<Mods>>() {
                }.getType();
                List<Mods> list = gson.fromJson(jsonString, type);
                for (Mods v : list) {
                    System.out.println(v.getId());
                    System.out.println("Get file list");
                    fileJsonString=Http.doHttpRequest("api/v2/addon/"+v.getId()+"/files");
                    Type type2=new  TypeToken<ArrayList<ModsFiles>>(){}.getType();
                    Gson gson2 = new Gson();
                      List<ModsFiles> mflist= gson.fromJson(fileJsonString, type2);
                      for(ModsFiles mf:mflist) {
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
