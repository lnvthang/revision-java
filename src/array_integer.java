import java.util.Arrays;

public class array_integer {
    public static void main(String[] args) {
        System.out.println("Numbers 1 list!");
        int[] numbers = {1,2,3,4,5};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
//        }

        System.out.println("Numbers 2 list!");
        int[] numbers2 = new int[5];
        numbers2[0] = 6;
        numbers2[1] = 7;
        numbers2[2] = 8;
        numbers2[3] = 9;
        numbers2[4] = 0;
//        for (int number : numbers2) {
//            System.out.println(number);
//        }

        System.out.println("Numbers 3 list!");
        int[] numbers3 = new int[5];
        numbers3[0] = 99;
        numbers3[1] = 3;
        numbers3[2] = 78;
        numbers3[3] = 159;
        numbers3[4] = 5;
        Arrays.sort(numbers3);
//        for (int number : numbers3) {
//            System.out.println(number);
//        }

        System.out.println("Find index by input number in sorted array");
        int index = Arrays.binarySearch(numbers3, 99);
        System.out.println("Index: " + index);

        System.out.println("Convert integer array to string");
        String arrayString = Arrays.toString(numbers);
        System.out.println("String: " + arrayString);
        
    }
}
