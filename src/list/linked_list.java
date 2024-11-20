package list;

import java.util.LinkedList;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.addFirst("Date");
        linkedList.addLast("Elderberry");

        System.out.println("Linked List: " + linkedList);

        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());
        System.out.println("Element at index 1: " + linkedList.get(1));

        linkedList.remove("Banana");
        linkedList.remove(0);
        System.out.println("After removals: " + linkedList);

        System.out.println("Size of list: " + linkedList.size());
        System.out.println("Is list empty? " + linkedList.isEmpty());

        System.out.println("Iterating through the list:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Checking if the linked list contains certain elements
        boolean hasApple = linkedList.contains("Apple");
        boolean hasGrapes = linkedList.contains("Grapes");
        System.out.println("Contains 'Apple'? " + hasApple); // true
        System.out.println("Contains 'Grapes'? " + hasGrapes); // false

        linkedList.clear();
        System.out.println("List after clearing: " + linkedList);
    }
}

/* Comparing ArrayList and LinkedList
* 1. Underlying Data Structure
* ArrayList:
*   Uses a dynamic array to store elements.
*   The array can grow as needed when more elements are added.
* LinkedList:
*   Uses a doubly linked list structure, where each element (node) contains references to the previous and next nodes.

* 2. Performance Characteristics
* Access Time
*   ArrayList: Provides constant-time (O(1)) access for getting elements by index since it uses an array.
*   LinkedList: Requires linear time (O(n)) to access elements by index because it must traverse the list from the beginning or end.
* Insertion and Deletion
*   ArrayList:
        Adding an element at the end is usually constant time (O(1)), but can be O(n) when resizing occurs.
        Inserting or removing elements from the middle requires shifting elements, which takes linear time (O(n)).
*   LinkedList:
        Insertion and deletion are generally constant time (O(1)) if the position is known (e.g., at the head or tail).
        However, finding the position takes linear time (O(n)), so overall performance can vary.
* 3. Memory Overhead
* ArrayList:
    Requires less memory overhead compared to LinkedList, as it only stores the elements in an array.
    However, it may have unused capacity if it has been resized.
* LinkedList:
    Each element (node) contains additional memory overhead for storing references to the next and previous nodes.
    This can lead to higher memory usage, especially for small lists.

* 4. Use cases
* ArrayList: Best suited for scenarios where frequent access by index is required
                and the list size is mostly static or grows at a predictable rate.
* LinkedList: Ideal for scenarios where frequent insertions and deletions are required,
                particularly at the ends of the list or when maintaining a queue or stack.

* Summary
* ArrayList is better for random access but slower for insertions and deletions (especially in the middle).
* LinkedList is better for insertions and deletions but slower for accessing elements by index.
* */