
public class Task4 {
    public static void main(String[] args) {
    //Variable Declaration
        double startBalance = 5000;
        double interest = .17;
        double monthlyBalance;
        double interestAmount;
        double month2;

        interestAmount = startBalance * interest;
        monthlyBalance = startBalance + interestAmount;
        month2 = (monthlyBalance * interest) + monthlyBalance;
        System.out.println(" Your first months payment with a starting balance of $5000 and 17 percent interest is " + monthlyBalance);
        System.out.println(" Your second months payment with the last months balance being $5850 is " + month2);






    }
}