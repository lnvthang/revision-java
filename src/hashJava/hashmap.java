package hashJava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 10);
        map.put("banana", 20);
        map.put("noodles", 49);
//        System.out.println(map);

        // Updates the value for "apple"
        map.put("apple", 30);

        Integer value = map.get("apple");
//        System.out.println("Value of apple key: " + value);

        Integer nonExistent = map.get("orange");
//        System.out.println("Value of null key: " + nonExistent);

        // Checks if the map contains the specified key.
        boolean hasApple = map.containsKey("apple");
        boolean hasOrange = map.containsKey("orange");
//        System.out.println("The map is contained key: " + hasApple);
//        System.out.println("The map is not contained key: " + hasOrange);

        // Checks if the map contains a specified value.
        boolean hasValue = map.containsValue(30);
        boolean hasNotValue = map.containsValue(99);
//        System.out.println("The map has value: " + hasValue);
//        System.out.println("The map has not value: " + hasNotValue);

        // Removes the key-value pair associated with the specified key.
        map.remove("banana");
//        System.out.println("The map when key deleted : " + map);

        // Size
        int size = map.size();
//        System.out.println("The size map: " + size);

        // Checks if the map is empty
        boolean isEmpty = map.isEmpty();
//        System.out.println("The map is empty: " + isEmpty);

        // Returns a Set view of all the keys in the map.
        Set<String> mapKeys = map.keySet();
//        System.out.println("The key map: " + mapKeys);

        // Returns a Collection view of all the values in the map.
        Collection<Integer> mapValues = map.values();
//        System.out.println("The value map: " + mapValues);

        // Returns a Set view of the key-value pairs in the map.
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        //  Adds the key-value pair only if the key is not already present in the map. If the key already exists, it does nothing.
        map.putIfAbsent("apple", 50);
//        System.out.println("The map is updated: " + map);

        // Replaces the value associated with the specified key only if the key is already present.
        map.replace("banana", 40);
//        System.out.println("The map is replaced banana key: " + map);

        // Replaces the value for the specified key only if the current value is equal to oldValue.
        boolean replaced = map.replace("apple", 30, 50);  // replaces only if current value is 30

        // Loop the key
//        map.forEach((key, val) -> System.out.println(key + ": " + val));

        // Check if the map has key, the result is the value of the key, otherwise the result is default value
        Integer valueKeyIsNotExit = map.getOrDefault("grape", 0);
//        System.out.println("The value of the keyword does not exist in the array :" + valueKeyIsNotExit);

        // Covert map to string
        String mapToString = map.toString();
//        System.out.println("Map to string: " + map.toString());

        // compute: Computes a new value for the given key using the provided function. If the key is not present, it can insert a new entry.
        map.compute("apple", (k, v) -> (v == null) ? 1 : v + 1);  // increases the value for "apple" by 1

        // computeIfAbsent: Computes a value for the given key if the key is not already mapped to a value.
        map.computeIfAbsent("orange", k -> 50);  // adds "orange" with value 50 if it's not present

        // computeIfPresent: Computes a new value for the given key only if the key is already mapped to a value.
        map.computeIfPresent("banana", (k, v) -> v + 10);  // increases the value for "banana" by 10

        // Clear the map
        map.clear();
//        System.out.println("The map is empty: " + map.isEmpty());

    }
}
