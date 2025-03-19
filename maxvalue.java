class maxvalue {
    public static void main(String[] args) {
// Initialize the scanner to read input
                // Define the string with comma-separated values
        String str = "123,454,789";
        // Split the string by commas into an array of strings
        String[] arr = str.split(",");
        // Initialize max with the smallest possible value or first element
        int max = 0;
        
        // Loop through the array and find the maximum value
        
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]); // Convert string to integer
            if (num > max) {
                max = num; // Update max if the current number is greater
            }
        }
        // Print the result
        System.out.println("The max value is: " + max);
    }
}