import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class list_string {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Cherry");

        System.out.println("First Element: " + stringList.get(0));

        for (String fruit : stringList) {
            System.out.println(fruit);
        }

        Collections.sort(stringList);
        System.out.println("Sorted List: \t" + stringList);

        stringList.remove("Banana");
//        stringList.remove(1);

        System.out.println("Size of list: " + stringList.size());
        System.out.println("Contains Cherry: " + stringList.contains("Cherry"));


        String[] array = stringList.toArray(new String[0]);
        System.out.println("Array: " + java.util.Arrays.toString(array));
    }
}

/*
* Comparing List and ArrayList
* 1. Flexibility
* List: As an interface, List can be implemented by various classes, such as ArrayList, LinkedList, and Vector.
*   Each implementation has different performance characteristics.
* ArrayList: Specifically implements the List interface using a dynamic array.
*   It provides fast random access to elements but may have slower insertions and deletions compared to linked list implementations.
*
* 2. Performance
* List: Performance characteristics depend on the specific implementation.
*   For instance, a LinkedList (another implementation of List) has different performance for adding and removing elements
*   compared to an ArrayList.
*
* ArrayList: Offers average constant time complexity (O(1)) for accessing elements and linear time complexity (O(n))
*   for adding/removing elements, especially when resizing is required.
* */