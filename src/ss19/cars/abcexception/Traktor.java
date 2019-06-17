package ss19.cars.abcexception;

public class Traktor extends VehicleABC implements Motor, Puller {

    private Pullable pullable;

    public Traktor(String color) {
        super(4, 1, color , 400000);
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
