package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    /**
     * @param strings list of strings to add / remove / fetch from
     */

    List<String> strings;
    HashMap<String, Integer> quantity;

    public Inventory(List<String> strings) {
        this.strings = strings;
        quantity = new HashMap<>();
        for (String str : strings) {
            Integer value = quantity.getOrDefault(str, 0);
            quantity.put(str, value + 1);
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        strings = new ArrayList<>();
        quantity = new HashMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        Integer value = quantity.getOrDefault(item, 0);
        quantity.put(item, value + 1);
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        if (!quantity.containsKey(item)) {
            System.out.println("Cannot reduce stock of item. Item stock is already zero.");
        } else {
            Integer value = quantity.get(item);
            quantity.put(item, value - 1);
        }
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        if (quantity.containsKey(item)) {
            return quantity.get(item);
        } else {
            return 0;
        }
    }
}
