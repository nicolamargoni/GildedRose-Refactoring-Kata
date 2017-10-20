package com.gildedrose;

public class ItemUpdaterFactory {

    public static ItemUpdater build(Item item) {
        switch (item.name) {
            case "Aged Brie":
                return new AgedBrieItemUpdater();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItemUpdater();
            case "Conjured Mana Cake":
                return new ConjuredItemUpdater();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesItemUpdater();
            default:
                return new ItemUpdater();
        }
    }
}
