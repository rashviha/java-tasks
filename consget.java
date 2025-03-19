class Main{
    public static void main(String[] args){
        Sample ref=new Sample("BMW","M5");//can be reused
          Sample ref1=new Sample("ford","c13");
        System.out.println(ref.carname);
        System.out.println(ref.carmodel);
        System.out.println(ref1.carname);
        System.out.println(ref1.carmodel);
    }
}
class Sample{
    String carname;
    String carmodel;
    //default constructor
    Sample(String carname, String carmodel){
        this.carname=carname;//should refer current object
         this.carmodel=carmodel;
    }
}