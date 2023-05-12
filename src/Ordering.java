import java.io.IOException;
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
        System.out.println(foods.size()+1+"."+"finish choosing");

    }
    static List<FoodsAndDrinks>  orderedFoods = new ArrayList<>();

    public List<FoodsAndDrinks> select() throws InterruptedException {
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
        boolean remove =true;
        while (remove && orderedFoods.size()!=0){
            System.out.println("these are your orders:");
            for (int i = 0; i <orderedFoods.size() ; i++) {
                System.out.println(i+1+"." +orderedFoods.get(i).getName());
            }
            System.out.println(orderedFoods.size()+1+"."+"confirm order");
            System.out.println("enter number to remove: ");

            int number =scanner.nextInt();
            if(number!=orderedFoods.size()+1){
                orderedFoods.remove(number-1);
            }else {
                remove=false;
            }

        }
        System.out.println("Here we go, you are nearly done but enter any comment about foods we wil try to consider:");
        String comment= scanner.next();
        System.out.println("Ok, we will try to take your request into account!");

        Thread.sleep(2000);
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                Runtime.getRuntime().exec("clear");
            }
        } catch (IOException | InterruptedException ex) {
            // Exception handling
        }


        return orderedFoods;
    }




}
