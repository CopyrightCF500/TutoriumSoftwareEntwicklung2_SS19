package ss19.cars.inter;

public class Batmobil implements MotorVehicle{

    @Override
    public int getWheelCount() {
        return 6;
    }

    @Override
    public int getCapacity() {
        return 1;
    }

    @Override
    public String getColor() {
        return "Black";
    }

    @Override
    public int getPower() {
        return 9000;
    }
}
