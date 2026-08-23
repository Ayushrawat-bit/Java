public class MatrixOperations {

    public static int[] rowSums(int[][] matrix) {
        int[] sums = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int total = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                total += matrix[i][j];
            }
            sums[i] = total;
        }
        return sums;
    }

    public static int[] columnSums(int[][] matrix) {
        int cols = matrix[0].length;
        int[] sums = new int[cols];
        for (int j = 0; j < cols; j++) {
            int total = 0;
            for (int i = 0; i < matrix.length; i++) {
                total += matrix[i][j];
            }
            sums[j] = total;
        }
        return sums;
    }

    public static int[][] add(int[][] first, int[][] second) {
        if (first.length != second.length || first[0].length != second[0].length) {
            System.out.println("Addition not possible (different sizes)");
            return null;
        }
        int[][] result = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[0].length; j++) {
                result[i][j] = first[i][j] + second[i][j];
            }
        }
        return result;
    }

    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] first, int[][] second) {
        if (first[0].length != second.length) {
            System.out.println("Multiplication not possible (bad sizes)");
            return null;
        }
        int r = first.length;
        int k = first[0].length;
        int c = second[0].length;
        int[][] result = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;
                for (int t = 0; t < k; t++) {
                    sum += first[i][t] * second[t][j];
                }
                result[i][j] = sum;
            }
        }
        return result;
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("No matrix to print");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
