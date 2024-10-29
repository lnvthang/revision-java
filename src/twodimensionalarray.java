public class twodimensionalarray {

    public static void loopItemInTwoDimensionalArray(int[][] array) {
        // Loop item
        for (int[] myNumber : array) {
            for (int i : myNumber) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        loopItemInTwoDimensionalArray(myNumbers);
    }
}