package Home_Work_Prog;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a <= b && a <= c)
            System.out.println("Smallest number is: " + a);
        else if(b <= a && b <= c)
            System.out.println("Smallest number is: " + b);
        else
            System.out.println("Smallest number is: " + c);
    }
}

