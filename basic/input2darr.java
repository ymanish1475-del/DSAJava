
import java.util.Scanner;

public class input2darr {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Get dimensions
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // 2. Initialize the 2D array
        int[][] matrix = new int[rows][cols];

        // 3. Nested loop to get elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close(); // Best practice to close scanner
    }
}

