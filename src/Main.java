import java.util.Scanner;

public class Main {
    static Scanner scanner =new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to cafe!");
        Payment payment =new Payment();
        System.out.println("Your total is: " +payment.calculate()+" sums");
    }
    }
