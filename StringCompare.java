class StringCompare {
    @SuppressWarnings("StringEquality")
    public static void main(String[] args) {
        // Declare and initialize strings
        String str = "hello";
        @SuppressWarnings("RedundantStringConstructorCall")
        String str1 = new String("hello");
        
        // Using == compares references (not content)
        System.out.println(str == str1); // Will print false, as they point to different objects

        // Using equals() compares the content of the strings
        System.out.println(str.equals(str1)); // Will print true, as both strings have the same content
    }
}

