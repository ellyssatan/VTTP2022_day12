package vttp.day12example;

import java.util.ArrayList;
import java.util.List;

// Service class
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

            itm = new Item();
            itm.setItemName("Off White Shoes");
            itm.setQuantity(10);
            listItems.add(itm);

            itm = new Item();
            itm.setItemName("Goyard Tote Bag");
            itm.setQuantity(50);
            listItems.add(itm);

            return listItems;
        }
}
