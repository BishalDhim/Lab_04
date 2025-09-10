import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
    //Variable Declarations
       double salesTax = .05;
       double totalPrice;
       double taxAmount;

       Scanner scan = new Scanner(System.in);



        System.out.println(" please input the price of your purchase value: ");
        double purchasePrice = scan.nextDouble();
        System.out.println();

        taxAmount = purchasePrice * salesTax;
        totalPrice = purchasePrice + taxAmount;

        System.out.println(" Your price after the 5% sales tax is " + totalPrice);








    }
}