package MidtermTest;

import java.util.ArrayList;

/**
 * @author Koki Sakai
 *
 *
 */

public class Driver {
    public static void main(String[] args) {
        ArrayList<Vehicle> arrayVehicle = new ArrayList<Vehicle>();
        arrayVehicle.add(new Car("c1", 250, true));
        arrayVehicle.add(new Car("c2", 220, true));
        arrayVehicle.add(new Car("c3", -210, false));
        arrayVehicle.add(new Boat("b1", 500));
        arrayVehicle.add(new Boat("b2", 700));
        arrayVehicle.add(new Boat("b3", 800));

        for (Vehicle array : arrayVehicle){
            System.out.println(array);
        }

        System.out.println();

        for (Vehicle array : arrayVehicle){
            array.accelerate();
        }
    }
}
