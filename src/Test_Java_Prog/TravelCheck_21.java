package Test_Java_Prog;
import java.util.*;
class TravelCheck_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Clear input buffer

        System.out.print("Enter Visa Status (valid/invalid): ");
        String visa = sc.nextLine();

        if(age >= 18 && visa.equalsIgnoreCase("valid")){
            System.out.println("✅ Person is eligible to travel.");
        }
        else {
            System.out.println("❌ Person is NOT eligible to travel.");
        }
    }
}
