package Test_Java_Prog;
import java.util.Scanner;
public class Print_No_11 {
            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter N: ");
            int N = sc.nextInt();

            System.out.print("Numbers from 1 to " + N + ": ");
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }

            sc.close();
        }
    }




