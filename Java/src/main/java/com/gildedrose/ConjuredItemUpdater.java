package com.gildedrose;

public class ConjuredItemUpdater extends ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);

        if (isSellDatePassed(item.sellIn)) {
            decrementQuality(item, 4);
        } else {
            decrementQuality(item, 2);
        }

        checkMinAdmissibleDecrementQualityAndFixElse(item);
    }
}
