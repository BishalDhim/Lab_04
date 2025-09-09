import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        //Variable Declaration
        double doubleOperandA = 5;
        double doubleOperandB = 8;
        double doubleSum = doubleOperandA + doubleOperandB;
        double doubleProduct = doubleOperandA * doubleOperandB;
        double doubleDifference = doubleOperandA - doubleOperandB;
        double doubleQuotient = doubleOperandA / doubleOperandB ;
        double doubleModulo = doubleOperandA % doubleOperandB ;


        System.out.println("The sum using double units is " + doubleSum);

        System.out.println("The product using double units is " + doubleProduct);

        System.out.println("The difference using double units is " + doubleDifference);

        System.out.println("The quotient using double units is " + doubleQuotient);

        System.out.println("The modulo using double units is " + doubleModulo);
    }
}