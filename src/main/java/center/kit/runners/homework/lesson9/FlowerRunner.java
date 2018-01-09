package center.kit.runners.homework.lesson9;

import center.kit.app.homework.lesson9.*;

public class FlowerRunner {
    public static void main(String[] args) {
        Flower rose = new Rose(ColorFlower.RED, 50);
        Flower lily = new Lily(ColorFlower.WHITE, 70);
        Flower peony = new Peony(ColorFlower.PINK, 85);
        Flower tulip = new Tulip(ColorFlower.YELLOW, 60);
        Flower tulip2 = new Tulip(ColorFlower.PINK, 60);
        MakeBouquet makeBouquet = new MakeBouquet(rose, lily, peony, tulip, tulip2);
        int price = makeBouquet.definePriceBouquet();
        System.out.println("Price of bouquet is " + price);

    }
}
