public class max {
    public static void main(String[] args) {
     
        int arr[][] = {
            {1, 4, 5, 8, 9},
            {11, 12, 13, 14}
        };

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; ++j) {
               
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println(" ");
        }
    }
}
