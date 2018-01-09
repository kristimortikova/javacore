package center.kit.app.classwork.lesson9;

public class Bicycle {
    private int wheelSize;
    private String color;
    private int speed;
    private String type;

    public Bicycle(int wheelSize, String color, int speed) {
        this();
        this.wheelSize = wheelSize;
        this.color = color;
        this.speed = speed;
    }

    public Bicycle(int wheelSize, String color, int speed, String type) {
        wheelSize = 51;
        color = "green";
        speed = 89;
        type = "eco";
    }


    public Bicycle() {
        this.wheelSize = 26;
        this.color = "green";
        this.speed = 70;
        this.type = "luxury";
    }


    public String ride() {
        return "wroom!";
    }
}
