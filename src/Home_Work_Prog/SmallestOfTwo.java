package Home_Work_Prog;

import java.util.Scanner;

public class SmallestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < b)
            System.out.println("Smallest number is: " + a);
        else
            System.out.println("Smallest number is: " + b);
    }
}
