package ss19.cars.inter2;

public class Traktor implements Vehicle,Motor,Puller {

    private final String color;

    private Pullable pullable;

    public Traktor(String color) {
        this.color = color;
    }

    @Override
    public int getPower() {
        return 150;
    }

    @Override
    public Pullable getPullable() {
        return pullable;
    }

    @Override
    public void setPullable(Pullable pullable) {
        this.pullable = pullable;
    }

    @Override
    public int getWheelCount() {
        return 4;
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
