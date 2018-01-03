package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.Bicycle2;
import center.kit.app.homework.lesson9.BicycleWithRing;
import center.kit.app.homework.lesson9.BicycleWithRingInterface;
import center.kit.app.homework.lesson9.CustomBicycle2;

public class Bicycle2Runner {
    public static void main(String[] args) {
        BicycleWithRingInterface bicycleWithRing = new BicycleWithRing();
        bicycleWithRing.ring();
        Bicycle2 customBicycle2 = new CustomBicycle2();
        customBicycle2.setGear(2);
        customBicycle2.ride();
    }
}
