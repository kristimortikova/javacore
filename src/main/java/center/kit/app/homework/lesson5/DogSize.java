package center.kit.app.homework.lesson5;

public class DogSize {
    public int setDog() {
        int weight = 24;
        if (weight > 20) {
            System.out.println("Pit bull");
            weight = weight - 5;
        }
        if (weight < 20) {
            System.out.println("Dalmatian");
            weight = weight - 6;
        }
        if (weight < 15) {
            System.out.println("Mops");
            weight = weight - 1;
        }
        return weight;

    }

}
