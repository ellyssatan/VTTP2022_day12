package com.example.day12example;

import java.util.ArrayList;
import java.util.List;

public class CartService {
    
        public List<Item> getShoppingItems() {
            
            List<Item> listItems = new ArrayList<>();

            Item itm = new Item();
            itm.setItemName("Prada Bag");
            itm.setQuantity(5);
            listItems.add(itm);

            itm = new Item();
            itm.setItemName("Chanel Bag");
            itm.setQuantity(2);
            listItems.add(itm);

            
            itm = new Item();
            itm.setItemName("Gucci Bag");
            itm.setQuantity(4);
            listItems.add(itm);

            itm = new Item();
            itm.setItemName("LV Bag");
            itm.setQuantity(5);
            listItems.add(itm);

            return listItems;
        }
}
