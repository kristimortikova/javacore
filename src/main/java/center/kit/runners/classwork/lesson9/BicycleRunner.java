package center.kit.runners.classwork.lesson9;

import center.kit.app.classwork.lesson9.Bicycle;

public class BicycleRunner {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(26, "red", 42);
        Bicycle fourparam = new Bicycle();
        System.out.println(fourparam.ride());


    }
}
