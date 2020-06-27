package io.github.litwak913;

import java.io.IOException;

public class CFMirror {

    private String jsonString;

    public void startMirror(String[] mirror,String mode){
        if(mirror[0]=="mods"){
            mirrorMods();
            if (mirror.length==2) {
                if (mirror[1] == "modpacks") {
                    mirrorModpacks();
                }
            }
        } else if (mirror[0]=="modpacks"){
            mirrorModpacks();
            if (mirror.length==2) {
                if (mirror[1] == "mods") {
                    mirrorMods();
                }
            }
        }
    }

    private void mirrorModpacks()  {

    }

    private void mirrorMods() {
        for(int i=0;i<100;i++)
            try{
                jsonString = Http.doHttpRequest("api/v2/addon/search?gameId=432&index=" + i * 100 + "&pageSize=100&sort=1&sectionId=6");
            } catch (IOException e){
                System.out.println("\033[31;4m"+"ERROR:"+e.getMessage()+"\033[0m");
                System.exit(1);
            }
        if(jsonString=="ERROR"){
            System.out.println("\033[31;4m"+"ERROR:Network Error"+"\033[0m");
            System.exit(1);
        }
        System.out.println(jsonString);
    }
}
