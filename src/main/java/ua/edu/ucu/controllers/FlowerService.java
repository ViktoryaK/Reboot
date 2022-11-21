package ua.edu.ucu.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.edu.ucu.Items.CactusFlower;
import ua.edu.ucu.Items.Flower;
import ua.edu.ucu.Items.FlowerColor;
import ua.edu.ucu.Items.RomashkaFlower;

import java.util.List;

@Service
public class FlowerService {

    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public List<Flower> getFlowers(){
        return flowerRepository.findAll();
    }

    public void addFlower(Flower flower) {
        flowerRepository.save(flower);
    }
}
