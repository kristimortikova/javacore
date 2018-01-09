package center.kit.app.homework.lesson9;

public class Peony extends Flower {
    public Peony(ColorFlower colorFlower, int priceFlower) {
        super(colorFlower, priceFlower);
        this.setPriceFlower(priceFlower);
    }

    @Override
    public void setPriceFlower(int priceFlower) {
        super.setPriceFlower(priceFlower);
        switch (colorFlower) {
            case RED:
                this.priceFlower = priceFlower + 90;
                break;
            case PINK:
            case WHITE:
                this.priceFlower = priceFlower + 70;
                break;
        }
    }
}
