class MinValue {
    public static void main(String[] args) {
        // Define the string with comma-separated values
        String str = "123,454,789";
        
        // Split the string by commas into an array of strings
        String[] arr = str.split(",");
        
        // Initialize min with the largest possible value (or first element)
        int min = Integer.MAX_VALUE;
        
        // Loop through the array and find the minimum value
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]); // Convert string to integer
            if (num < min) {
                min = num; // Update min if the current number is smaller
            }
        }
        
        // Print the result
        System.out.println("The minimum value is: " + min);
    }
}
