
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

//Calling scanner functions for taking user inputs
        Scanner sc = new Scanner(System.in);

//Taking inputs for calculations a and b
        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second number : ");
        int b = sc.nextInt();

        System.out.print("Enter the operations you want (+ , - , * , /): ");
        char op = sc.next().charAt(0);

        int result = 0;

        if (op == '+') {
            result = a + b; 
        }else if (op == '-') {
            result = a - b; 
        }else if (op == '/') {
            result = a / b; 
        }else if (op == '*') {
            result = a * b; 
        }else {
            System.out.println("Invalid input");
        }

        System.out.println("Result = " + result);
        sc.close();

    }

}
