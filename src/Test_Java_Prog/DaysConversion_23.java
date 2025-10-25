package Test_Java_Prog;
import java.util.*;
class DaysConversion_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Total Days: ");
        int days = sc.nextInt();

        int years = days / 365;
        days = days % 365;

        int months = days / 30;
        days = days % 30;

        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }
}

