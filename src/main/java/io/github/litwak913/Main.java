package io.github.litwak913;


import org.apache.commons.cli.*;

public class Main {
    private static CommandLine commandLine;

    public static void main(String[] args)  {
        CommandLineParser parser=new BasicParser();

        Options options=new Options();
        options.addOption("t","type",true,"set mirror type");
        options.addOption("m","mode",true,"set mirror mode");
        options.addOption("o","output",false,"set mirror output dir");
        options.addOption("v","verbose",false,"verbose mode");
        try {
             commandLine = parser.parse(options, args);
        } catch(ParseException e ){
            System.out.println("\033[31;4m"+"ERROR:Parse Error"+e.toString()+"\033[0m");
            System.exit(1);
        }
        boolean verbose=false;
        String outputdir="";
        String modes="";
        String[] type = {};
        if (commandLine.hasOption("t")){
            type=commandLine.getOptionValue("t").split(" ");
        }
        if (commandLine.hasOption("m")){
            modes=commandLine.getOptionValue("m");
        }
        if (commandLine.hasOption("o")){
            outputdir=commandLine.getOptionValue("f");
        }
        if (commandLine.hasOption("v")){
            verbose=true;
        }
        new CFMirror().startMirror(type,modes,verbose,outputdir);
    }
}
