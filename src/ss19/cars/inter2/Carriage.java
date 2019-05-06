package ss19.cars.inter2;

public class Carriage implements Vehicle, Loadable, Pullable {

    private int load;

    private Puller puller;

    public Carriage(int load) {
        this.load = load;
    }

    @Override
    public int getLoad() {
        return load;
    }

    @Override
    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public Puller getPuller() {
        return puller;
    }

    @Override
    public void setPuller(Puller puller) {
        this.puller = puller;
    }

    @Override
    public int getWheelCount() {
        return 4;
    }

    @Override
    public int getCapacity() {
        return 0;
    }

    @Override
    public String getColor() {
        return "Grey";
    }
}
