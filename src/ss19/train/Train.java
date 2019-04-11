package ss19.train;

import ss19.train.waggon.Type;
import ss19.train.waggon.Waggon;

/**
 * Every train starts with an engine.
 * @author Eduard Bartolovic
 */
public class Train {

    /**
     * First Waggon of Train
     */
    private final Waggon waggon;
    
    /**
     * Contructor
     */
    public Train(){
        waggon = new Waggon(Type.ENGINE);   
    }
    
    /**
     * enlarging the train.
     * @param type Type
     */
    public void enlarge(Type type) {
        if(waggon.getNext() == null)
            waggon.setNext(new Waggon(type));
        else{
            boolean conti = true;
            for(Waggon next = waggon.getNext(); conti ;next = next.getNext()){
                if(next.getNext() == null){
                    next.setNext(new Waggon(type));
                    conti = false;
                }         
            }
        }
    }

    /**
     * getter for capacity
     * @return capacity int
     */
    public int getCapacity() {
        int capacity = waggon.getCapacity();
        for(Waggon next = waggon.getNext(); next!=null ;next = next.getNext()){
            capacity += next.getCapacity();
        }
        return capacity;
    }

    /**
     * getter for start of train
     * @return start
     */
    public Waggon getEngine() {
        return waggon;
    }

    @Override
    public String toString() {
        String string = waggon.toString();
        for(Waggon next = waggon.getNext(); next!=null ;next = next.getNext()){
            string += next.toString();
        }
        return string;
    }
}
