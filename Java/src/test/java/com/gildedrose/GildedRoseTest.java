package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    public static final String OUTPUT =
            "-------- day 0 --------\n" +
            "+5 Dexterity Vest, 10, 20\n" +
            "+5 Dexterity Vest, 0, 20\n" +
            "+5 Dexterity Vest, 0, 0\n" +
            "Aged Brie, 2, 0\n" +
            "Aged Brie, 0, 50\n" +
            "Elixir of the Mongoose, 5, 7\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 15, 20\n" +
            "Backstage passes to a TAFKAL80ETC concert, 10, 49\n" +
            "Backstage passes to a TAFKAL80ETC concert, 5, 49\n" +
            "Backstage passes to a TAFKAL80ETC concert, 0, 49\n" +
            "Conjured Mana Cake, 3, 6\n" +
            "Conjured Mana Cake, 0, 6\n" +
            "-----------------------\n" +
            "\n" +
            "-------- day 1 --------\n" +
            "+5 Dexterity Vest, 9, 19\n" +
            "+5 Dexterity Vest, -1, 18\n" +
            "+5 Dexterity Vest, -1, 0\n" +
            "Aged Brie, 1, 1\n" +
            "Aged Brie, -1, 50\n" +
            "Elixir of the Mongoose, 4, 6\n" +
            "Sulfuras, Hand of Ragnaros, 0, 80\n" +
            "Sulfuras, Hand of Ragnaros, -1, 80\n" +
            "Backstage passes to a TAFKAL80ETC concert, 14, 21\n" +
            "Backstage passes to a TAFKAL80ETC concert, 9, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, 4, 50\n" +
            "Backstage passes to a TAFKAL80ETC concert, -1, 0\n" +
            "Conjured Mana Cake, 2, 4\n" +
            "Conjured Mana Cake, -1, 2\n" +
            "-----------------------\n\n";



    @Test
    public void testGildedRose() {
        String tempOutput = "";

        Item[] items = new Item[]{
                ItemFactory.build("+5 Dexterity Vest", 10, 20),
                ItemFactory.build("+5 Dexterity Vest", 0, 20),
                ItemFactory.build("+5 Dexterity Vest", 0, 0),
                ItemFactory.build("Aged Brie", 2, 0),
                ItemFactory.build("Aged Brie", 0, 50),
                ItemFactory.build("Elixir of the Mongoose", 5, 7),
                ItemFactory.build("Sulfuras, Hand of Ragnaros", 0, 80),
                ItemFactory.build("Sulfuras, Hand of Ragnaros", -1, 80),
                ItemFactory.build("Backstage passes to a TAFKAL80ETC concert", 15, 20),
                ItemFactory.build("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                ItemFactory.build("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                ItemFactory.build("Backstage passes to a TAFKAL80ETC concert", 0, 49),
                ItemFactory.build("Conjured Mana Cake", 3, 6),
                ItemFactory.build("Conjured Mana Cake", 0, 6)
        };

        GildedRose app = new GildedRose(items);

        int days = 2;

        for (int day = 0; day < days; day++) {
            tempOutput += "-------- day " + day + " --------\n";
            for (Item item : items) {
                tempOutput += item.toString() + "\n";
            }

            if (days > 0) {
                app.updateQuality();
            }
            tempOutput += "-----------------------\n\n";
        }

        assertEquals(OUTPUT,tempOutput);

    }


}
