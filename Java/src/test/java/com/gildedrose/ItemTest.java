package com.gildedrose;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void testItem() {
        Item item = new Item("item", 10, 4);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("item", item.name);
        assertEquals(9, item.sellIn);
        assertEquals(3, item.quality);
    }

    @Test
    public void testItemSellInLessThan0() {
        Item item = new Item("item", 0, 2);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("item", item.name);
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }


    @Test
    public void testAgedBrieItemQualityEqual50() {
        Item item = new Item("Aged Brie", 0, 50);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Aged Brie", item.name);
        assertEquals(-1, item.sellIn);
        assertEquals(50, item.quality);
    }

    @Test
    public void testAgedBrieItem() {
        Item item = new Item("Aged Brie", 0, 4);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Aged Brie", item.name);
        assertEquals(-1, item.sellIn);
        assertEquals(5, item.quality);
    }

    @Test
    public void testSulfurasItem() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Sulfuras, Hand of Ragnaros", item.name);
        assertEquals(0, item.sellIn);
        assertEquals(80, item.quality);
    }

    @Test
    public void testBackstagePassesItemSellInEqualTo10() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 4);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(9, item.sellIn);
        assertEquals(6, item.quality);
    }

    @Test
    public void testBackstagePassesItemSellInEqualTo5() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 4);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(4, item.sellIn);
        assertEquals(7, item.quality);
    }

    @Test
    public void testBackstagePassesItemSellInLessThan0() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 4);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Backstage passes to a TAFKAL80ETC concert", item.name);
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }

    @Test
    public void testConjuredItemSellInGreatherThan0() {
        Item item = new Item("Conjured Mana Cake", 3, 4);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Conjured Mana Cake", item.name);
        assertEquals(2, item.sellIn);
        assertEquals(2, item.quality);
    }

    @Test
    public void testConjuredItemSellInLessThan0() {
        Item item = new Item("Conjured Mana Cake", 0, 4);
        ItemUpdater itemUpdater = ItemUpdaterFactory.build(item);
        itemUpdater.update(item);

        assertEquals("Conjured Mana Cake", item.name);
        assertEquals(-1, item.sellIn);
        assertEquals(0, item.quality);
    }




}
