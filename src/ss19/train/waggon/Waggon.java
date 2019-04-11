package ss19.train.waggon;

/**
 * Waggon
 * @author Eduard Bartolovic
 */
public class Waggon{

    private final Type type;
    
    private Waggon next;

    /**
     * Constructor
     * @param type Type
     */
    public Waggon(Type type) {
        this.type = type;
    }
    
    /**
     * getter for Type
     * @return Type
     */
    public Type getType() {
        return type;
    }

    /**
     * getter for Capacity from this waggon
     * @return capacity int
     */
    public int getCapacity() {
        return type.getCapacity();
    }

    /**
     * next Waggon getter
     * @return nextWaggon Waggon
     */
    public Waggon getNext() {
        return next;
    }

    /**
     * Setter for next Waggon
     * @param nextWaggon Waggon
     */
    public void setNext(Waggon nextWaggon) {
        next = nextWaggon;
    }

    @Override
    public String toString() {
        return ","+type+","+getCapacity();
    }
    
    
    
}
