package center.kit.app.homework.lesson9;

public abstract class Flower {
    protected ColorFlower colorFlower;
    protected int priceFlower;//стартовая цена цветка

    protected Flower(ColorFlower colorFlower, int priceFlower) {
        this.colorFlower = colorFlower;
        this.priceFlower = priceFlower;
    }

    public ColorFlower getColorFlower() {
        return colorFlower;
    }

    public void setColorFlower(ColorFlower colorFlower) {
        this.colorFlower = colorFlower;

    }

    public int getPriceFlower() {
        return priceFlower;
    }

    public void setPriceFlower(int priceFlower) {
        this.priceFlower = priceFlower;
    }
}
