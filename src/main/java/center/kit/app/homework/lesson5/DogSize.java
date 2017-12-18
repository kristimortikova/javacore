package center.kit.app.homework.lesson5;

public class DogSize {
    public int setDog(int weight) {

        if (weight < 25) {
            System.out.println("Pit bull");
        }
        if (weight > 10) {
            System.out.println("Dalmatian");

        }
        if (weight < 7) {
            System.out.println("Mops");

        }

        return weight;

    }

}
