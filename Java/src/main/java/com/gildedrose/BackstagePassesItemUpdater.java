package com.gildedrose;

public class BackstagePassesItemUpdater extends ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);

        if (isSellInGreatherThan10(item.sellIn)) {
            incrementQuality(item);
        } else if (isSellInBetween10and6(item.sellIn)) {
            incrementQuality(item,2);
        } else if (isSellInBetween5and0(item.sellIn)) {
            incrementQuality(item,3);
        } else {
            item.quality = 0;
        }

        checkMaxAdmissibleIncrementQualityAndFixElse(item);
    }

    private static boolean isSellInGreatherThan10(int sellIn) {
        return sellIn > 10;
    }

    private static boolean isSellInBetween10and6(int sellIn) {
        return sellIn <= 10 && sellIn > 5;
    }

    private static boolean isSellInBetween5and0(int sellIn) {
        return sellIn <= 5 && sellIn >= 0;
    }


}
