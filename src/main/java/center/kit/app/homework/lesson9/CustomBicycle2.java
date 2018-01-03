package center.kit.app.homework.lesson9;

public class CustomBicycle2 extends Bicycle2 {
    @Override
    public void ride() {
        System.out.println("Wshhhh!");
    }

    public int setSpeed(int speed) {
        this.speed = speed;
        System.out.println("speed: " + speed);
        return speed;
    }

    public int setGear(int gear) {
        this.gear = gear;
        System.out.println("gear: " + gear);
        return gear;
    }
}
