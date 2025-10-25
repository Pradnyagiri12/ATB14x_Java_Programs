package Test_Java_Prog;
import java.util.*;
public class ElectricityBill_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Units Consumed: ");
        int units = sc.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 0.50;
        } else if (units <= 200) {
            bill = (100 * 0.50) + ((units - 100) * 0.75);
        } else if (units <= 300) {
            bill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
        } else {
            bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
        }

        System.out.println("Total Electricity Bill: Rs " + bill);
    }

}