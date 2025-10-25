package Test_Java_Prog;
import java.util.*;
class DivisibleCheck_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if(num % 5 == 0 && num % 11 == 0){
            System.out.println("The number is divisible by both 5 and 11.");
        }
        else {
            System.out.println("The number is NOT divisible by both 5 and 11.");
        }
    }
}

