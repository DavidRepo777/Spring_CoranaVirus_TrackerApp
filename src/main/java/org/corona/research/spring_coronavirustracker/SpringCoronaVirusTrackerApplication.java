package org.corona.research.spring_coronavirustracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringCoronaVirusTrackerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringCoronaVirusTrackerApplication.class, args);

    }

}
