package Test_Java_Prog;
import java.util.*;
public class BonusCalculation_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Years of Experience: ");
        double exp = sc.nextDouble();

        double bonus = 0;

        if(exp < 1){
            bonus = 0;
        }
        else if(exp >= 1 && exp <= 3){
            bonus = salary * 0.05;
        }
        else if(exp >= 4 && exp <= 6){
            bonus = salary * 0.10;
        }
        else {
            bonus = salary * 0.15;
        }

        System.out.println("Bonus Amount: " + bonus);
    }
}
