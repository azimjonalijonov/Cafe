import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordering {
    static List<FoodsAndDrinks> foods = new ArrayList<>();

    public static void order(){
        foods.add(new Barbeque());
        foods.add(new Pilav());
        foods.add(new Cake());
        System.out.println("select menu:");
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(i+1+"." +foods.get(i).getName()+"  "+foods.get(i).getPrice()+" sums");

        }

    }
    public List<FoodsAndDrinks> select(){
        List<FoodsAndDrinks> orderedFoods = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        order();
        boolean ordering=true;
        while (ordering){

            String input =scanner.next();
            

        }

    }

}
