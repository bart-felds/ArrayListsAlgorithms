public class taskthree {
    public static double avgsmall(int[][] array) {
        int rows = array.length;
        
        int cols = array[0].length;
        int sum = 0;

        for (int col = 0; col < cols; col++) {
            int min = array[0][col];
            for (int row = 1; row < rows; row++) {
                if (array[row][col] < min) {
                    min = array[row][col];
                }
            }
            sum += min;
        }

        return (double) sum / cols;
    }

    public static void main(String[] args) {
        int[][] nums = {
            {3, 5, 1},
            {4, 2, 6},
            {7, 8, 0}
        };
        System.out.println(avgsmall(nums));
    }
}
