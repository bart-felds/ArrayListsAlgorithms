public class practicearrayenh {
    public static void calc(int[][] array) {
        int totalRowSum = 0;
        int rowIndex = 0;

        for (int[] row : array) {
            int rowSum = 0;
            for (int value : row) {
                rowSum += value;
            }
            System.out.println("Row " + rowIndex + " sum is " + rowSum);
            totalRowSum += rowSum;
            rowIndex++;
        }

        double averageOfRowSums = (double) totalRowSum / array.length;
        System.out.println("Avg of all sum are " + averageOfRowSums);
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {4, 5, 9}
        };
        calc(matrix);
    }
}
