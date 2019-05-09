package ss19.cars.abc;

/**
 * The Batmobil.
 * @author Eduard Bartolovic
 */
public class Batmobil extends VehicleABC implements Motor {

    public Batmobil() {
        super(6, 1, "Black");
    }

    @Override
    public int getPower() {
        return 9000;
    }
}
