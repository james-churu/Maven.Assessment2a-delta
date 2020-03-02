package rocks.zipcode.assessment2.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {

    HashMap<String,Integer> items = new HashMap<>();
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        for(String element : strings){
            if(items.containsKey(element)){
                Integer currentAmnt = items.get(element);
                items.put(element,currentAmnt +1);
            }else{
                items.put(element,1);
            }

        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if(items.containsKey(item)){
            Integer holder =  items.get(item);
            items.put(item, holder+1);
        }else{
            items.put(item,1);
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {
        Integer currentAmnt = items.get(item);
        items.put(item,currentAmnt -1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
        Integer num  = items.get(item);
        if(num == null){
            num = 0;
        }
        return  num;
    }
}
