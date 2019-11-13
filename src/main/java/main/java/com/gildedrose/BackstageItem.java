package main.java.com.gildedrose;

public class BackstageItem extends Item {
    public BackstageItem( int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        if (quality < 50) {
            quality = quality + 1;

            if ((sellIn < 11) &&(quality < 50)) {
                    quality = quality + 1;
                }


            if ((sellIn < 6) && (quality < 50)) {
                    quality = quality + 1;
                }

        }

        sellIn = sellIn - 1;

        if (sellIn < 0) {
            quality = 0;
        }


    }
}
