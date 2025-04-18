package numberdemo2;
import java.util.Scanner;

public class NumberDemo2 {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);

        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static void displayTwiceTheNumber(int number) {
        System.out.println("Twice " + number + " = " + (number * 2));
    }

    public static void displayNumberPlusFive(int number) {
        System.out.println(number + " plus five = " + (number + 5));
    }

    public static void displayNumberSquared(int number) {
        System.out.println(number + " squared = " + (number * number));
    }
    
}
