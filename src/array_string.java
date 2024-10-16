import java.util.Arrays;
import java.util.List;

public class array_string {
    public static void main(String[] args) {
        System.out.println("String 1 list!");
        String[] stringList1 = new String[] {"Java","JSTS","Python","Golang"};
//        for (int i = 0; i < stringList1.length; i++) {
//            System.out.println(stringList1[i]);
//        }

        System.out.println("String 2 list!");
        String[] stringList2 = new String[5];
        stringList2[0] = "6";
        stringList2[1] = "7";
        stringList2[2] = "8";
        stringList2[3] = "9";
        stringList2[4] = "0";
//        for (String str : stringList2) {
//            System.out.println(str);
//        }

        Arrays.sort(stringList1);
        System.out.println("stringList1 sorted: " + stringList1);

        System.out.println("Find index in stringList1 by keyword");
        int index = Arrays.binarySearch(stringList1, "JSTS");
        System.out.println("Index: " + index);

        System.out.println("Combine string arrays");
        String[] array1 = {"apple", "banana"};
        String[] array2 = {"cherry", "date"};
        String[] combinedArray = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, combinedArray, array1.length, array2.length);
//        for (String str : combinedArray) {
//            System.out.println(str);
//        }

        System.out.println("Check item in string array by keyword");
        boolean contains = Arrays.asList(stringList1).contains("Golang");
        System.out.println(contains);

        System.out.println("Convert string array to string");
        String joinedString = String.join(", ", stringList1);
        System.out.println(joinedString);

        
    }
}
