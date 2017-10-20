package com.gildedrose;

public class ItemUpdater {

    public static int MAX_ADMISSIBLE_QUALITY_INCREMENTED_VALUE = 50;
    public static int MIN_ADMISSIBLE_QUALITY_INCREMENTED_VALUE = 50;

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
        if (item.quality > MAX_ADMISSIBLE_QUALITY_INCREMENTED_VALUE) {
            item.quality = MAX_ADMISSIBLE_QUALITY_INCREMENTED_VALUE;
        }
    }

    public static void checkMinAdmissibleDecrementQualityAndFixElse(Item item) {
        if (item.quality < MIN_ADMISSIBLE_QUALITY_INCREMENTED_VALUE) {
            item.quality = MIN_ADMISSIBLE_QUALITY_INCREMENTED_VALUE;
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
