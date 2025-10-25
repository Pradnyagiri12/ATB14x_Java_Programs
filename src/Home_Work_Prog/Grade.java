package Home_Work_Prog;
import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int m = s.nextInt();

        if(m < 0 || m > 100) {
            System.out.println("Invalid Marks");
        }
        else if(m >= 90) {
            System.out.println("Grade = A+");
        }
        else if(m >= 80) {
            System.out.println("Grade = A");
        }
        else if(m >= 70) {
            System.out.println("Grade = B");
        }
        else if(m >= 60) {
            System.out.println("Grade = C");
        }
        else if(m >= 50) {
            System.out.println("Grade = D");
        }
        else if(m >= 40) {
            System.out.println("Grade = E");
        }
        else {
            System.out.println("Fail");
        }
    }
}
