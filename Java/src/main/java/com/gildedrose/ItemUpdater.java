package com.gildedrose;

public class ItemUpdater {

    public void update(Item item) {
        decrementSellIn(item);

        if (isSellDatePassed(item.sellIn)) {
            decrementQuality(item, 2);
        } else {
            decrementQuality(item, 1);
        }

        checkMinAdmissibleDecrementQualityAndFixElse(item);
    }

    public static void checkMaxAdmissibleIncrementQualityAndFixElse(Item item) {
        if (item.quality > 50) {
            item.quality = 50;
        }
    }

    public static void checkMinAdmissibleDecrementQualityAndFixElse(Item item) {
        if (item.quality < 0) {
            item.quality = 0;
        }
    }

    public static boolean isSellDatePassed(int sellIn) {
        return sellIn < 0;
    }

    public static void incrementQuality(Item item) {
        item.quality += 1;
    }

    public static void incrementQuality(Item item, int multiplier) {
        item.quality += 1 * multiplier;
    }

    public static void decrementQuality(Item item) {
        item.quality -= 1;
    }

    public static void decrementQuality(Item item, int multiplier) {
        item.quality -= 1 * multiplier;
    }

    public static void decrementSellIn(Item item) {
        item.sellIn--;
    }
}
