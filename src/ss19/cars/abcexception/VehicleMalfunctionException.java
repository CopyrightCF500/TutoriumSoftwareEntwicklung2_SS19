package ss19.cars.abcexception;

public class VehicleMalfunctionException extends Exception {

    public VehicleMalfunctionException() {
        super("Motor died");
    }


    public VehicleMalfunctionException(String message) {
        super(message);
    }
}
