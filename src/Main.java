import java.util.Scanner;

public class Main {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to cafe!");
        Thread.sleep(3000);

        Payment payment =new Payment();
        int total = payment.calculate();
        if(total!=0) {
            System.out.println("Your total is: " + total + " sums");
            Thread.sleep(2000);
            payment.pay();

        }else {
            System.out.println("you did not purchase anything yet");

        }
        }
    }
