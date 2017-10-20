package com.gildedrose;

public class ConjuredItemUpdater {

    public static Item update(Item item) {
        item.sellIn--;

        if (item.sellIn<0) {
            item.quality-=4;
        } else {
            item.quality-=2;
        }

        if(item.quality<0){
            item.quality=0;
        }

        return item;
    }
}
