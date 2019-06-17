package ss19.cars.abccollection;

/**
 * The Batmobil.
 * @author Eduard Bartolovic
 */
public class Batmobil extends VehicleABC implements Motor {

    public Batmobil() {
        super(6, 1, "Black", Integer.MAX_VALUE);
    }

    @Override
    public int getPower() {
        return 9000;
    }
}
