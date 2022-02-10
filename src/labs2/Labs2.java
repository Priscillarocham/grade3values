package labs2;

import java.util.Scanner;

/**
 *
 * @author Priscilla
 */
public class Labs2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write the first number: ");
        double firstNumber = sc.nextDouble();
        System.out.println("Write the second number: ");
        double secondNumber = sc.nextDouble();
        System.out.println("Write the third number: ");
        double thirdNumber = sc.nextDouble();

        System.out.println("First Value: " + firstNumber);
        System.out.println("Second Value: " + secondNumber);
        System.out.println("Third Value: " + thirdNumber);

        
        int average = (int) (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average = " + average);

        printGrade(average);

    }

    private static void printGrade(int average) {
        if (average > 90) {
            System.out.println("Grade A");
        } else if (average >=80 && average <90) {
            System.out.println("Grade B");
        } else if (average >=60 && average <80){
            System.out.println("Grade C");    
        } else { 
            System.out.println("Grade F");
        }
    }
}
