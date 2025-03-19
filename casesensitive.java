class casesensitive {
    public static void main(String[] args) {
        String str1="java";
        String str2="java";
        System.out.println("Case-sensitive equals:"+str1.equals(str2));
        System.out.println("Case-insensitive equals:"+str1.equalsIgnoreCase(str2));
    
    }
}