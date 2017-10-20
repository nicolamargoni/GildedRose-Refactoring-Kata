package com.gildedrose;

public class DefaultItemUpdater{

    public static Item update(Item item) {
        item.sellIn--;

        if (item.sellIn<0) {
            item.quality-=2;
        } else {
            item.quality--;
        }

        if(item.quality<0){
            item.quality=0;
        }

        return item;
    }
}
