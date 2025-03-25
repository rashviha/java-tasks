class Shoppingitem{
    void additems(String item_name, int price){
        System.out.println("Item is:"+item_name+" "+"price is:"+price);
    }
    void additems(String item_name, int price, int item_quantity){
        int totalprice=price*item_quantity;
        System.out.println("Item name is"+" "+"Quantity:"+item_quantity+" "+"total_price"+totalprice);
    }
    void additems(String item_name, int price, int item_quantity, int discount)
    {
        double finalamount=(item_quantity*price)-discount;
        System.out.println("final discount:"+finalamount);
    }
}
public class Shoppingcart{
    public static void main(String[] args)
    {
        Shoppingitem ref= new Shoppingitem();
        ref.additems("laptop",3000);
        ref.additems("keyboard",1000,3);
        ref.additems("mouse",4000,5,10);
    }
}
