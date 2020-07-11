package io.github.litwak913;


import com.beust.jcommander.Parameter;

public class Config {
    @Parameter(names = "--output", description = "Set output Dir", order = 1)
    String dir = "./output";
    @Parameter(names = "--mode",
            description = "Set mirror mode",
            required = true,
            order = 0)
    String mode;
    @Parameter(names = "--help", help = true, order = 3, description = "display this help and exit")
    boolean help;
    @Parameter(names = "--version", help = true, order = 4, description = "output version information and exit")
    boolean version;
}
