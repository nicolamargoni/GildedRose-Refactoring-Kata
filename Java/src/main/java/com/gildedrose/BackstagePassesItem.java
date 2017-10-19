package com.gildedrose;

public class BackstagePassesItem extends Item {

    public BackstagePassesItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        decrementSellIn();

        if (isSellInGreatherThan10()) {
            incrementQuality(1);
        } else if (isSellInBetween10and6()) {
            incrementQuality(2);
        } else if (isSellInBetween5and0()) {
            incrementQuality(3);
        } else {
            quality = 0;
        }

        checkMaxAdmissibleIncrementQualityAndFix();
    }

    public boolean isSellInGreatherThan10(){
        return sellIn > 10;
    }

    public boolean isSellInBetween10and6(){
        return sellIn <= 10 && sellIn > 5;
    }

    public boolean isSellInBetween5and0(){
        return sellIn <= 5 && sellIn >= 0;
    }
}
