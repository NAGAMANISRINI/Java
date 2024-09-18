class Restaurent{
    void orderpizza(String pizza,int pizza_qty){
    System.out.println("i want" + pizza_qty + " " + pizza);
    }
    void orderburger(String burger,int burger_qty){
    System.out.println("i want" + burger_qty + " " + burger);   
    }
} 
public class first{
    public static void main(String[] args){
        Restaurent obj1= new Restaurent();
        obj1.orderpizza("chicken pizza",2);
        Restaurent obj2 = new Restaurent();
        obj2.orderburger("chicken burger",3);
    }
}