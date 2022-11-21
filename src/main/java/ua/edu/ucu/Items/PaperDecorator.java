package ua.edu.ucu.Items;

public class PaperDecorator extends ItemDecorator{

    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    public String getDescription() {
        return null;
    }

    public double getPrice(){
        return 13 + this.item.getPrice();
    }
}
