package center.kit.app.homework.lesson9;

public abstract class Bicycle2 {
    protected int speed;
    protected int gear;

    public void ride() {
        System.out.println("Wroom!");
    }

    public abstract int setSpeed(int speed);

    public abstract int setGear(int gear);
}
