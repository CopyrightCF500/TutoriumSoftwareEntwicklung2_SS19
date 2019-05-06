package ss19.cars.inter2;

/**
 * The Batmobil.
 * @author Eduard Bartolovic
 */
public class Batmobil implements Vehicle,Motor {

    /**
     * Has always 6 wheels
     * @return 6 int
     */
    @Override
    public int getWheelCount() {
        return 6;
    }

    /**
     * Has always 1 seat
     * @return 1 int
     */
    @Override
    public int getCapacity() {
        return 1;
    }

    /**
     * Is always Black
     * @return Black String
     */
    @Override
    public String getColor() {
        return "Black";
    }

    /**
     * Has always 9000PS
     * @return 9000 int
     */
    @Override
    public int getPower() {
        return 9000;
    }
}
