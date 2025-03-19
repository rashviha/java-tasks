@SuppressWarnings("unused")
class Main {
    public static void main(String[] args) {
    System.out.println( Objectoriented.a);  
    //non static
     Objectoriented ref=new Objectoriented();
     System.out.println("Non static var:"+ref.name);
     System.out.println("Non static var:"+ref.rollno);
     //static member
     System.out.println("static var:"+Objectoriented.a);
     Objectoriented.display();
     
    }
}
class Objectoriented{
      //non-static members  //using objects
    String name="java";
    String rollno="2332j20";
       //static 
    static int a=10;
    public static void display(){
    System.out.println("Static Methods");
}
}

