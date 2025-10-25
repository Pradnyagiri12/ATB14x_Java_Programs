package Home_Work_Prog;
import java.util.Scanner;
class ATM_13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int bal = 10000;

        System.out.print("Enter amount: ");
        int amt = s.nextInt();

        if(amt <= 0) {
            System.out.println("Enter Valid Amount");
        }
        else if(amt % 100 != 0) {
            System.out.println("Amount must be multiple of 100");
        }
        else if(amt > bal) {
            System.out.println("Not Enough Balance");
        }
        else {
            bal = bal - amt;
            System.out.println("Withdraw Successful");
            System.out.println("Remaining Balance: " + bal);
        }
    }
}

