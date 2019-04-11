package ss19.train;

import ss19.train.waggon.Type;

public class Main {

    public static void main(String[] args) {
        final Train train = new Train();
        for(int  i = 0; i <1000 ; i++)
            train.enlarge(Type.BISTRO);

        System.out.println(train);
        System.out.println(train.getCapacity());
    }
}
