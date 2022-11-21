package ua.edu.ucu.Items;

public class BasketDecorator extends ItemDecorator{

    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    public double getPrice(){
        return 4 + this.item.getPrice();
    }

    public String getDescription() {
        return "In basket";
    }
}
