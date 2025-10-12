package Test_Java_Prog;
import java.util.Scanner;
public class Factorial_12 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a positive integer: ");
            int n = sc.nextInt();
            long fact = 1;
            int i = 1;

            while (i <= n) {
                fact *= i;
                i++;
            }

            System.out.println(n + "! = " + fact);
            sc.close();
        }
    }


