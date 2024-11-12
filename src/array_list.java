import java.util.ArrayList;

public class array_list {

    public static CommonUtils common = new CommonUtils();

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add(1, "Date");

        System.out.println("ArrayList: " + arrayList);

        String firstElement = arrayList.get(0);
        System.out.println("First Element: " + firstElement);

        System.out.println("Size: " + arrayList.size());
        System.out.println("Is empty? " + arrayList.isEmpty());

        arrayList.remove("Banana");
        System.out.println("After removal: " + arrayList);

        System.out.println("Iterating through the list:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        String[] array = arrayList.toArray(new String[0]);
        System.out.println("Array: " + java.util.Arrays.toString(array));

        arrayList.clear();
        System.out.println("List after clearing: " + arrayList);
    }
}

/*
* All method array list
* 1. addAll(Collection<? extends E> c)
* 2. removeAll(Collection<?> c
* 3. clear
* 4. set(int index, E element)
* 5. contains(Object o): Returns true if the list contains the specified element.
* 6. indexOf(Object o): Returns the index of the first occurrence of the specified element, or -1 if the list does not contain it.
* 7. lastIndexOf(Object o): Returns the index of the last occurrence of the specified element, or -1 if the list does not contain it.
* 8. toArray(): Returns an array containing all of the elements in the list.
* 9. toString(): Returns a string representation of the list.
* 10. str.split(","): Split a string into an array based on a specified delimiter.
* */
