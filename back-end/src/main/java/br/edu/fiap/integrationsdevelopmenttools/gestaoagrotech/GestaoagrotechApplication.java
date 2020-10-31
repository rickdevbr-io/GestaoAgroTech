package br.edu.fiap.integrationsdevelopmenttools.gestaoagrotech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GestaoagrotechApplication {

    public static void main(String[] args) {
        SpringApplication.run(GestaoagrotechApplication.class, args);
    }
}
