package com.gildedrose;

public class ItemFactory {

    public static Item build(String name, int sellIn, int quality) {
        switch (name) {
            case "Aged Brie":
                return new AgedBrieItem(name, sellIn, quality);
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem(name, sellIn, quality);
            case "Conjured Mana Cake":
                return new ConjuredItem(name, sellIn, quality);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesItem(name, sellIn, quality);
            default:
                return new Item(name, sellIn, quality);
        }
    }
}
