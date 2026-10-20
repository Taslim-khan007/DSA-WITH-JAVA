public class diagonalSum {

    public static int diagonalSum(int matrix[][]) {

        int sum = 0;

        // Traverse the matrix using a single loop
        for (int i = 0; i < matrix.length; i++) {

            // Primary diagonal (top-left to bottom-right)
            sum += matrix[i][i];

            // Secondary diagonal (top-right to bottom-left)
            // Avoid adding the center element twice
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - 1 - i];
            }
        }

        // Return the total sum
        return sum;
    }

    public static void main(String args[]) {

        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        System.out.println("Diagonal Sum = " + diagonalSum(matrix));
    }
}
