package com.gildedrose;

public class ItemUpdater {

    public static Item update(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return AgedBrieItemUpdater.update(item);
            case "Sulfuras, Hand of Ragnaros":
                return SulfurasItemUpdater.update(item);
            case "Conjured Mana Cake":
               return ConjuredItemUpdater.update(item);
            case "Backstage passes to a TAFKAL80ETC concert":
                return BackstagePassesItemUpdater.update(item);
            default:
                return DefaultItemUpdater.update(item);
        }
    }
}
