package ua.edu.ucu.Items;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Setter
public class Flower extends Item{
    @Id
    @SequenceGenerator(
            name = "flower_sequence",
            sequenceName = "flower_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "flower_sequence"
    )
    private Integer price;
    private FlowerColor color;


    @Getter
    private int sepalLength;

    public Flower(Integer pr, FlowerColor col, int sep) {
        price = pr;
        color = col;
        sepalLength = sep;
    }

    public Flower() {

    }

    public Flower(int pr, String col, int sep) {
        price = pr;
        if (col.equals("blue")) {
            color = FlowerColor.BLUE;
        }
        else {color = FlowerColor.RED;}
        sepalLength = sep;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", color=" + color +
                ", sepalLength=" + sepalLength +
                "} " + super.toString();
    }
}