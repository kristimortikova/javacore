package center.kit.app.homework.lesson9;

public class Tulip extends Flower {
    public Tulip(ColorFlower colorFlower, int priceFlower) {
        super(colorFlower, priceFlower);
        this.setPriceFlower(priceFlower);
    }

    @Override
    public void setPriceFlower(int priceFlower) {
        super.setPriceFlower(priceFlower);
        switch (colorFlower) {
            case RED:
            case YELLOW:
            case ORANGE:
                this.priceFlower = priceFlower + 55;
                break;
            case PINK:
                this.priceFlower = priceFlower + 65;
        }
    }
}
