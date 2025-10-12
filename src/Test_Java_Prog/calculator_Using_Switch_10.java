package Test_Java_Prog;
import java.util.Scanner;
public class calculator_Using_Switch_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/':
                if (b == 0) System.out.println("Error: Division by zero!");
                else System.out.println("Result: " + (a / b));
                break;
            default: System.out.println("Invalid operator!");
        }

        sc.close();
    }
    }

