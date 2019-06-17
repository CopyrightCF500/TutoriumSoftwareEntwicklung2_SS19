package ss19.cars.abccollection;

import java.util.Collection;

public interface Loadable {

    Collection<Integer> getLoad();

    void putLoad(int obj);

    void removeLoad(int obj);
}
