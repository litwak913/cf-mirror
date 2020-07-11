package io.github.litwak913;


import com.beust.jcommander.JCommander;

public class Main {


    public static void main(String[] args) {
        Config cfg = new Config();
        String jarpath = System.getProperty("java.class.path");

        String[] jarpatharray = jarpath.split("/");
        String jarName = jarpatharray[jarpatharray.length - 1];
        JCommander jcmd = new JCommander().newBuilder().addObject(cfg).build();
        jcmd.parse(args);
        if (cfg.help) {
            jcmd.setProgramName("java -jar " + jarName);
            jcmd.usage();
            return;
        }
        if (cfg.version) {
            JCommander.getConsole().println("CFMirror v1.0");
            JCommander.getConsole().println("This program may be freely redistributed under the terms of the GNU General Public License.");
            return;
        }
        new CFMirror().startMirror(cfg.mode, cfg.dir);
    }
}
