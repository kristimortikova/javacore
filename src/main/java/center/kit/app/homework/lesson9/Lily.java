package center.kit.app.homework.lesson9;

public class Lily extends Flower {
    public Lily(ColorFlower colorFlower, int priceFlower) {
        super(colorFlower, priceFlower);
        this.setPriceFlower(priceFlower);
    }

    @Override
    public void setPriceFlower(int priceFlower) {
        super.setPriceFlower(priceFlower);
        switch (colorFlower) {
            case RED:
                this.priceFlower = priceFlower + 80;
                break;
            case PINK:
                this.priceFlower = priceFlower + 60;
                break;
            case WHITE:
                this.priceFlower = priceFlower + 55;
                break;
            case YELLOW:
            case ORANGE:
                this.priceFlower = priceFlower + 45;
        }
    }
}
