package loopingWithJava;

public class logicalLoops {
    public static void main(String[] args) {
        int[][] matrixA = { {1, 2}, {3, 4} };
        int[][] matrixB = { {5, 6}, {7, 8} };
        int[][] result = new int[2][2];

        int i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                int k = 0;
                while (k < 2) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                    k++;
                }
                j++;
            }
            i++;
        }

        // Display the result
        i = 0;
        while (i < 2) {
            int j = 0;
            while (j < 2) {
                System.out.print(result[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}