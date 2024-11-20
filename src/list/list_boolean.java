package list;

import java.util.ArrayList;
import java.util.List;

public class list_boolean {
    public static void main(String[] args) {
        List<Boolean> booleanList = new ArrayList<>();

        booleanList.add(true);
        booleanList.add(false);
        booleanList.add(true);
        booleanList.add(false);

        System.out.println("First Element: " + booleanList.get(0));

        System.out.println("All values:");
        for (Boolean value : booleanList) {
            System.out.println(value);
        }

        booleanList.remove(Boolean.FALSE);
        System.out.println("After removal: " + booleanList);

        System.out.println("Size of list: " + booleanList.size());
        System.out.println("Contains true: " + booleanList.contains(true));

        long trueCount = booleanList.stream().filter(b -> b).count();
        long falseCount = booleanList.stream().filter(b -> !b).count();
        System.out.println("Number of true values: " + trueCount);
        System.out.println("Number of false values: " + falseCount);

        booleanList.clear();
        System.out.println("List after clearing: " + booleanList);
    }
}
