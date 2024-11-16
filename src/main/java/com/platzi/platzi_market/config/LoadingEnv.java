package com.platzi.platzi_market.config;

import io.github.cdimascio.dotenv.Dotenv;

public class LoadingEnv {
    public static void loadEnv(String[] args) {
        String env = "dev";
        for (String arg : args) {
            if (arg.startsWith("--env=")) {
                env = arg.substring("--env=".length());
            }
        }

        String envFile = "." + env + ".env";
        Dotenv dotenv = Dotenv.configure()
            .filename(envFile)
            .ignoreIfMalformed()
            .ignoreIfMissing()
            .load();

        dotenv.entries().forEach(entry -> {
            System.setProperty(entry.getKey(), entry.getValue());
        });
    }
}
