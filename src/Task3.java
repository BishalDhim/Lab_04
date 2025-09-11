import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //Variable Declarations
        double springMaintenance;
        double summerMaintenance;
        double fallMaintenance;
        double winterMaintenance;
        double yearlyMaintenance;
        Scanner scan = new Scanner(System.in);

        System.out.println(" What is your maintenance cost for the spring ");
        springMaintenance = scan.nextDouble();
        System.out.println(" What is your maintenance cost for the summer ");
        summerMaintenance = scan.nextDouble();
        System.out.println(" What is your maintenance cost for the fall ");
        fallMaintenance = scan.nextDouble();
        System.out.println(" What is your maintenance cost for the winter ");
        winterMaintenance = scan.nextDouble();

        yearlyMaintenance = springMaintenance + summerMaintenance + fallMaintenance + winterMaintenance;
        System.out.println(" Your yearly cost of maintenance comes out to " + yearlyMaintenance);




    }
}