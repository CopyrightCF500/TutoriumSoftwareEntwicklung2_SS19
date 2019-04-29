package ss19.cars.abc;

public class MotorVehicle extends VehicleABC {

    private final int power;

    public MotorVehicle(int wheelCount, int capacity, String color, int power) {
        super(wheelCount, capacity, color);
        if(power>1000)
            throw new IllegalArgumentException();
        this.power = power;
    }

    public int getPower(){
        return power;
    }
}
