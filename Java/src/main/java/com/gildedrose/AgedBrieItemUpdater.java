package com.gildedrose;

public class AgedBrieItemUpdater{

    public static Item update(Item item) {
        item.sellIn--;
        item.quality++;

        if(item.quality>50){
            item.quality=50;
        }

        return item;
    }
}
