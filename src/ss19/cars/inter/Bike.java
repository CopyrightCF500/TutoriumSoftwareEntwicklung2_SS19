package ss19.cars.inter;

public class Bike implements Vehicle {

    private final String color;

    public Bike(String color) {
        this.color = color;
    }

    @Override
    public int getWheelCount() {
        return 2;
    }

    @Override
    public int getCapacity() {
        return 1;
    }

    @Override
    public String getColor() {
        return color;
    }
}
