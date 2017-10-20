package com.gildedrose;

public class AgedBrieItemUpdater extends ItemUpdater {

    @Override
    public void update(Item item) {
        decrementSellIn(item);
        incrementQuality(item);
        checkMaxAdmissibleIncrementQualityAndFixElse(item);
    }
}
