package io.github.litwak913;


import com.beust.jcommander.JCommander;

public class Main {


    public static void main(String[] args) {
        Config cfg = new Config();
        JCommander jcmd = new JCommander().newBuilder().addObject(cfg).build();
        if (cfg.help) {
            jcmd.setProgramName("java -jar cf-mirror.jar");
        }
        new CFMirror().startMirror(cfg.mode, cfg.dir);
    }
}
