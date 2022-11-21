package ua.edu.ucu.Items;

public class RibbonDecorator extends ItemDecorator{


    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    public double getPrice(){
        return 40 + this.item.getPrice();
    }

    public String getDescription() {
        return "Ribbon";
    }
}
