package ss19.cars.abccollection;

public class VehicleMalfunctionException extends Exception {

    public VehicleMalfunctionException() {
        super("Motor died");
    }


    public VehicleMalfunctionException(String message) {
        super(message);
    }
}
