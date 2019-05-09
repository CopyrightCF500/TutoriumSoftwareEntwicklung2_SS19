package ss19.cars.abc;

public class Traktor extends VehicleABC implements Motor, Puller {

    private Pullable pullable;

    public Traktor(String color) {
        super(4, 1, color);
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

}
