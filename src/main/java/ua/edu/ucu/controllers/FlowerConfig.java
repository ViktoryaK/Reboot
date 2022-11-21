package ua.edu.ucu.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.edu.ucu.Items.CactusFlower;
import ua.edu.ucu.Items.Flower;
import ua.edu.ucu.Items.FlowerColor;
import ua.edu.ucu.Items.RomashkaFlower;

import java.util.List;
import java.util.Set;

@Configuration
public class FlowerConfig {

    @Bean
    CommandLineRunner commandLineRunner(FlowerRepository repository) {
        return args -> {
            Flower flowerOne = new Flower(
                    100,
                    "blue",
                    100
            );

            repository.saveAll(List.of(flowerOne));
        };

    }
}
