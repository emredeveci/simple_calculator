import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //below code will ask for 2 integers and a mathematical operation
        //based on the entries, it will calculate and print the result
        int numberOne, numberTwo, operation;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        numberOne = input.nextInt();
        System.out.print("Enter the second number: ");
        numberTwo = input.nextInt();

        System.out.println("\"1\" for Addition\n\"2\" for Subtraction\n\"3\" for Multiplication\n\"4\" for Division");
        System.out.print("Enter your choice: ");
        operation = input.nextInt();

        switch (operation) {
            case 1:
                System.out.println("Result is: " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("Result is: " + (numberOne - numberTwo));
                break;
            case 3:
                System.out.println("Result is: " + (numberOne * numberTwo));
                break;
            case 4:
                if(numberTwo == 0) {
                    System.out.println("You cannot divide by zero.");
                } else {
                    System.out.println("Result is: " + (numberOne / numberTwo));
                }
                break;
            default:
                System.out.println("You need to enter a correct number.");
        }
    }
}