public class practicearray {
    public static void calc(int[][] array) {
        int totalRowSum = 0;

        for (int i = 0; i < array.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                rowSum += array[i][j];
            }
            System.out.println("Row " + i + " sum is " + rowSum);
            totalRowSum += rowSum;
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
