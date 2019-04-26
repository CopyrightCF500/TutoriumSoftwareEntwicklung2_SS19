package ss19.train.waggon;

/**
 * Enum von typen von Waggonen
 * @author Eduard Bartolovic
 */
public enum Type {
    /** Zugmaschiene */ENGINE,
    /** Essenswagen */BISTRO,
    /** Ersteklasse */FIRST, 
    /** Zweiteklasse */SECOND;
    
    /**
     * getter for capacity
     * @return capacity int
     */
    public int getCapacity() {
        final int cap;
        switch (this) {
          case ENGINE: cap = 1;
                  break;
          case BISTRO: cap = 10;
                  break;
          case FIRST: cap = 20;
                  break;
          default: cap = 30;
                  break;
        }
        return cap;
    }


}