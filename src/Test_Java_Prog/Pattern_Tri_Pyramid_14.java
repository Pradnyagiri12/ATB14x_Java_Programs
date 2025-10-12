package Test_Java_Prog;
import java.util.Scanner;

public class Pattern_Tri_Pyramid_14 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of rows: ");
            int n = sc.nextInt();

            // Right Triangle
            System.out.println("\nRight Triangle:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

            // Pyramid
            System.out.println("\nPyramid:");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {  // spaces
                    System.out.print(" ");
                }
                for (int k = 1; k <= 2 * i - 1; k++) { // stars
                    System.out.print("*");
                }
                System.out.println();
            }

            sc.close();
        }
    }

