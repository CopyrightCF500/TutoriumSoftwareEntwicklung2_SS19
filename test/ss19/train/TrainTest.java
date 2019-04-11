package ss19.train;

import org.junit.Test;
import static org.junit.Assert.*;
import ss19.train.waggon.Type;
import ss19.train.waggon.Waggon;

/**
 *
 * @author Eduard Li530S
 */
public class TrainTest {
    
    public TrainTest() {
    }

    /**
     * Test of enlarge method, of class Train.
     */
    @Test(timeout = 1000)
    public void testEnlarge() {
        Train instance = new Train();
        assertEquals(1, instance.getCapacity());
        instance.enlarge(Type.ENGINE);
        assertEquals(2, instance.getCapacity());
        instance.enlarge(Type.BISTRO);
        assertEquals(12, instance.getCapacity());
        instance.enlarge(Type.FIRST);
        assertEquals(32, instance.getCapacity());
        instance.enlarge(Type.SECOND);
        assertEquals(62, instance.getCapacity());
    }


    /**
     * Test of shorten and enlarge method, of class Train.
     */
    @Test(timeout = 1000)
    public void testIntegrity() {
        Train instance = new Train();
        assertEquals(1, instance.getCapacity());
        Waggon waggon = instance.getEngine();
        assertEquals(Type.ENGINE, waggon.getType());
        
        instance.enlarge(Type.BISTRO);
        
        waggon = instance.getEngine();
        assertEquals(Type.ENGINE, waggon.getType());
        assertEquals(Type.BISTRO, waggon.getNext().getType());
        
        instance.enlarge(Type.FIRST);
        
        assertEquals(Type.FIRST, waggon.getNext().getNext().getType());
        
        instance.enlarge(Type.FIRST);
        assertEquals(Type.FIRST, waggon.getNext().getNext().getNext().getType());
        
        instance.enlarge(Type.BISTRO);
        
        assertEquals(Type.BISTRO, waggon.getNext().getNext().getNext().getNext().getType());
        
        instance.enlarge(Type.SECOND);
        
        assertEquals(Type.SECOND, waggon.getNext().getNext().getNext().getNext().getNext().getType());
        assertEquals(null, waggon.getNext().getNext().getNext().getNext().getNext().getNext());
    }
    

    /**
     * Test of getEngine method, of class Train.
     */
    @Test(timeout = 1000)
    public void testGetEngine() {
        Train instance = new Train();
        Waggon result = instance.getEngine();
        assertEquals(Type.ENGINE, result.getType());
    }

}
