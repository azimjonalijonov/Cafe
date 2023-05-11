import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ordering {
    static List<FoodsAndDrinks> foods = new ArrayList<>();

    public  void order(){
        foods.add(new Barbeque());
        foods.add(new Pilav());
        foods.add(new Cake());
        foods.add(new Juice());
        foods.add(new Cola());
        
        foods.add(new Tea());
        System.out.println("select menu:");
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(i+1+"." +foods.get(i).getName()+"  "+foods.get(i).getPrice()+" sums");

        }
        System.out.println(foods.size()+1+"."+"finish ordering");

    }
    static List<FoodsAndDrinks>  orderedFoods = new ArrayList<>();

    public List<FoodsAndDrinks> select(){
     //   List<FoodsAndDrinks>  orderedFoods = new ArrayList<>();
        Scanner scanner =new Scanner(System.in);
        order();
        boolean ordering=true;
        while (ordering){
            System.out.println("enter number for food or drink:");

       int input =scanner.nextInt();
       if(input!=foods.size()+1){
           orderedFoods.add(foods.get(input-1));

       }else
       {
           ordering=false;
       }

        }
return orderedFoods;
    }

}
