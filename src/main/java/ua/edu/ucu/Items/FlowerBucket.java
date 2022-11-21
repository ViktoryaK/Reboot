package ua.edu.ucu.Items;

import java.util.ArrayList;
import java.util.Hashtable;

public class FlowerBucket extends Item{

    private double sum = 0;
    private ArrayList<FlowerPack> flowers;

    public FlowerBucket() {
        this.flowers = new ArrayList<>();
    }

    public void addFlowers(FlowerPack flowerPack) {
        flowers.add(flowerPack);
    }

    public boolean searchFlower(Item flower) {
        for (FlowerPack pack: flowers) {
            if (pack.getFlower().getClass().equals(flower.getClass())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getPrice() {
        for (FlowerPack flo: flowers) {
            sum += flo.getPrice();
        }
        return sum;
    }
}

