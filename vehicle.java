package PROGRAM;
class main{
    public static void main(String[] args){
        vehicle ref=new bike();
        ref.startsusing();
    }
}
abstract class vehicle {
  abstract void startsusing();
}
class bike extends vehicle{
    void startsusing() {
        System.out.println("bike starts with kick:");
    }
}
