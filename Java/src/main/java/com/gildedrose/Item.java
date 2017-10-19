package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void updateQuality() {
        decrementSellIn();

        if (isSellDatePassed()) {
            decrementQuality(2);
        } else {
            decrementQuality(1);
        }

        checkMinAdmissibleDecrementQualityAndFix();
    }

    public void checkMaxAdmissibleIncrementQualityAndFix() {
        if (quality > 50) {
            quality = 50;
        }
    }

    public void checkMinAdmissibleDecrementQualityAndFix() {
        if (quality < 0) {
            quality = 0;
        }
    }

    public boolean isSellDatePassed() {
        return sellIn < 0;
    }

    public void incrementQuality(int multiplier) {
        quality += 1 * multiplier;
    }

    public void decrementQuality(int multiplier) {
        quality -= 1 * multiplier;
    }

    public void decrementSellIn() {
        sellIn--;
    }


}
