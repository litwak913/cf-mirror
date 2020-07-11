package io.github.litwak913;


public class Main {


    public static void main(String[] args) {
        boolean verbose = false;
        String dir = "./output";
        if (args.length != 1) {
            System.out.println("Usage: java -jar cf-mirror.jar <mode>  [dir] [verbose] ");
            System.out.println("Mode: \n list: mirror all mods lists. " +
                    "\n file: mirror all mods files. " +
                    "\n all: mirror all mods list and files");
        }
        if (args.length == 2) {
            dir = args[1];
        }
        if (args.length == 3) {
            if (args[2].equals("on")) {
                verbose = true;
            }
        }


        new CFMirror().startMirror(args[0], verbose, dir);
    }
}
