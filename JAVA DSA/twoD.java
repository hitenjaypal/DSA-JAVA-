import java.util.*;

public class twoD {

    public static void main(String[] args) {
        int[][] matrix = new int [3][3];
        Scanner sc = new Scanner (System.in);
        
        int smallest = matrix[0][0];
        int largest = matrix[0][0];

        // iterate through each element of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix [i][j] = sc.nextInt();


                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }

}
