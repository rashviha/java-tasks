public class max {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int arr[][] = {
            {1, 4, 5, 8, 9},
            {11, 12, 13, 14}
        };

        // Loop through the rows
        for (int i = 0; i < arr.length; ++i) {
            // Loop through each column in the current row
            for (int j = 0; j < arr[i].length; ++j) {
                // Print the element in the current row and column
                System.out.print(arr[i][j] + "   ");
            }
            // Print a new line after each row
            System.out.println(" ");
        }
    }
}
