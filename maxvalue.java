class maxvalue {
    public static void main(String[] args) {
        String str = "123,454,789";
        String[] arr = str.split(",");
        int max = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]); 
            if (num > max) {
                max = num; 
            }
        }
        
        System.out.println("The max value is: " + max);
    }
}
