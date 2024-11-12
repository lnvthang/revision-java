public class twodimensionalarray {

    public static void loopItemInTwoDimensionalArray(int[][] array) {
        // Loop item
        for (int[] myNumber : array) {
            for (int i : myNumber) {
                System.out.println(i);
            }
        }
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
//        int[][] array2Dimension01 = new int[3][4];

        int[][] array2Dimension02 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 45;

        int numRows = myNumbers.length;
        int numCols = myNumbers[0].length;
//        System.out.println("number of rows: " + numRows);
//        System.out.println("number of columns: " + numCols);
//        loopItemInTwoDimensionalArray(myNumbers);

        numRows = array2Dimension02.length;
        numCols = array2Dimension02[0].length;
        System.out.println("number of rows: " + numRows);
        System.out.println("number of columns: " + numCols);

        int[][] arr2dimension = transpose(array2Dimension02);

        numRows = arr2dimension.length;
        numCols = arr2dimension[0].length;
        System.out.println("number of rows: " + numRows);
        System.out.println("number of columns: " + numCols);
//        loopItemInTwoDimensionalArray(arr2dimension);
    }
}