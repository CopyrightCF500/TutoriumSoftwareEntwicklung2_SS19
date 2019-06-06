package ss19.cars.abcexception.abc;

public class Sportcar extends Car {

    private boolean sportMode;

    /**
     * Constructor.
     *
     * @param color
     * @param capacity
     * @param power
     */
    public Sportcar(String color, int capacity, int power) {
        super(color, capacity, power);
    }

    public void toogleMode(){
        sportMode = !sportMode;
    }

    public boolean getModeState(){
        return sportMode;
    }

    @Override
    public int getPower() {
        if(sportMode){
            return super.getPower()*2;
        }
        return super.getPower();
    }
}
