package Home_Work_Prog;

import java.util.Scanner;
class LeapYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = s.nextInt();

        if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}
