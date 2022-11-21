package ua.edu.ucu.Items;

public class FlowerPack {
    public Flower getFlower() {
        return flower;
    }

    public int getQuantity() {
        return quantity;
    }

    private Flower flower;
    private int quantity;


    public FlowerPack(Flower flower, int quantity) {
        this.flower = flower;
        this.quantity = quantity;
    }

    public double getPrice() {
        double sum = flower.getPrice() * quantity;
        return sum;
    }
}
