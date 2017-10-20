package com.gildedrose;

public class BackstagePassesItemUpdater {

    public static Item update(Item item) {
        item.sellIn--;

        if (item.sellIn > 10) {
            item.quality++;
        } else if (item.sellIn <= 10 && item.sellIn > 5) {
            item.quality += 2;
        } else if (item.sellIn <= 5 && item.sellIn >= 0) {
            item.quality += 3;
        } else {
            item.quality = 0;
        }

        if(item.quality>50){
            item.quality=50;
        }

        return item;
    }
}
