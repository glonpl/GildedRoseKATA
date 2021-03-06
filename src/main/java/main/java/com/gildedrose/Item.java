package main.java.com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public static Item createItem(String name, int sellIn, int quality) {
        switch (name) {
        case "Aged Brie":
            return new AgedBrieItem(sellIn, quality);
        case "Backstage passes to a TAFKAL80ETC concert":
            return new BackstageItem(sellIn, quality);
        case "Sulfuras, Hand of Ragnaros":
            return new SulfurasItem( sellIn, quality);
        case "Conjured Mana Cake":
             return new ConjuredManaCakeItem( sellIn, quality);
        default:
            return new Item(name, sellIn, quality);
    }


    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    protected void doUpdateQuality() {
        {
            if (quality > 0) {
                quality = quality - 1;
            }


            sellIn = sellIn - 1;


            if ((sellIn < 0) && (quality > 0)) {
                    quality = quality - 1;

            }

        }


    }
}
