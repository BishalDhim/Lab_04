import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        //Variable Declaration

        double F;
        double C;
        Scanner scan = new Scanner(System.in);

        System.out.println(" Input the temperature in degrees F");

        F = scan.nextDouble();
        C = (double) 5 / 9 * (F - 32);

        System.out.println(" The temperature in C is " + C);


    }
    }



