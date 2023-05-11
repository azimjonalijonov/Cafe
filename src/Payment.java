import java.util.List;

public class Payment {
    private  int bill=0;
    Ordering ordering =new Ordering();
    List<FoodsAndDrinks> orders =ordering.select();

    public int calculate(){
        for (FoodsAndDrinks food:orders
             ) {

            bill=bill+food.getPrice();

        }
        return bill;
    }
}
