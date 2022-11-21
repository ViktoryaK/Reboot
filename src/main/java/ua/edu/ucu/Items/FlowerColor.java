package ua.edu.ucu.Items;

public enum FlowerColor {
    /**
     * Flower colors.
     */
    RED("red"), BLUE("blue");
    private final String stringRepresentation;

    FlowerColor(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
