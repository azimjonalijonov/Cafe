import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Payment {
    Scanner scanner =new Scanner(System.in);
    private  int bill=0;
    Ordering ordering =new Ordering();
    List<FoodsAndDrinks> orders =ordering.select();

    public Payment() throws InterruptedException {
    }

    public int calculate(){
        for (FoodsAndDrinks food:orders
             ) {

            bill=bill+food.getPrice();

        }
        return bill;
    }



    public void pay(){
        System.out.println("choose your card type: ");
        System.out.println("1.HumoCard");
        System.out.println("2.UzCard");
        System.out.println("3.MasterCard");
        System.out.println("4.VisaCar");
        System.out.println("5.in cash");

        int input =scanner.nextInt();
        Random random =new Random();

        int money =random.nextInt(100)+1;
        switch (input){
            case 1,2,3,4:

                System.out.println("enter password");
                String password =scanner.next();
                   if(money>=bill){


                System.out.println("here we go , you payment is done! ");}
                   else {
                       System.out.println("you dont have enough money in your card , please try in other ways!");

                  }
                   break;
            default:
                System.out.println("ok you can pay in cash! ");
        }

    }
}
