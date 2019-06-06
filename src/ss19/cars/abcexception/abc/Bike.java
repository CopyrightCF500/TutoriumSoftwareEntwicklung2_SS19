package ss19.cars.abcexception.abc;

/**
 * Simple Bike
 * @author Eduard Bartolovic
 */
public class Bike extends VehicleABC {

    /**
     * Constructor.
     * @param color String
     */
    public Bike(String color) {
        super(2,1,color,Integer.MAX_VALUE);
    }

}
