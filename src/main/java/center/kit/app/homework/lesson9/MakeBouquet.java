package center.kit.app.homework.lesson9;

public class MakeBouquet {
    private Flower[] makeBouquet;
    private int makeBouquetVolume;

    public MakeBouquet(int volume) {
        this.makeBouquetVolume = volume;
        this.makeBouquet = new Flower[makeBouquetVolume];
    }

    public MakeBouquet(Flower... flowers) {
        this.makeBouquet = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            makeBouquet[i] = flowers[i];
        }
    }

    public Flower[] getMakeBouquet() {
        return makeBouquet;
    }

    public int definePriceBouquet() {
        int price = 0;
        for (int i = 0; i < makeBouquet.length; i++) {
            price = price + makeBouquet[i].getPriceFlower();
        }
        return price;
    }
}

