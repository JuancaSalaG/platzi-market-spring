package com.platzi.platzi_market;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.platzi.platzi_market.config.LoadingEnv;

@SpringBootApplication
public class PlatziMarketApplication {

	public static void main(String[] args) {
		//* Set up the environment variables using args
		LoadingEnv.loadEnv(args);
		String[] filteredArgs = Arrays.stream(args)
            .filter(arg -> !arg.startsWith("--env="))
            .toArray(String[]::new);

		SpringApplication.run(PlatziMarketApplication.class, filteredArgs);
	}

}
