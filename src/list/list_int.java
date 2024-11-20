package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_int {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        // Adding items
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Access item
        int idx = numbers.get(2);
        System.out.println("Access item in list: \t" + idx);

        // Update item
        numbers.set(2,9);
        System.out.println("Updated item for list: \n" + numbers);

        // Delete item
        numbers.remove(1);
        System.out.println("Deleted item for list: \n" + numbers);

        System.out.println("Loop item in list");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        boolean isEmpty = numbers.isEmpty();
        System.out.println("Check list is empty: " + isEmpty);

        boolean containsItem = numbers.contains(50);
        System.out.println("Check item in list: " + containsItem);

        // Clear items in list
        // numbers.clear();

        Collections.sort(numbers);
        System.out.println("Sorting items in list: " + numbers);

        Integer[] array = numbers.toArray(new Integer[0]);
        System.out.println("Convert list to array: " + numbers);

        System.out.println("Max: " + Collections.max(numbers) + ", Min: " + Collections.min(numbers));

    }
}
