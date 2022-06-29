//Part 1 - Commission Calculator
//Java app that takes numerical input from a user. The app should calculate commission based on this chart used by the retail store. Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sales figure: ");
        int sales = scanner.nextInt();
        double commission = 0;
    
        if (sales >= 10001) {
            commission = sales * 0.3;   
        } else if (sales >= 5001 && sales <= 10000) {
            commission = sales * 0.2; 
        } else if (sales >= 1000 && sales <= 5000) {
            commission = sales * 0.1; 
        } else { 
            System.out.println("You do not qualify for commission");
        } 
        System.out.println("Your commission is: $ "+ commission);
    }
}
