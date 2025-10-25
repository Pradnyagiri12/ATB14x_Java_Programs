package Test_Java_Prog;
    import java.util.*;
    class NetSalary_20 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Basic Salary: ");
            double basic = sc.nextDouble();

            double hra = basic * 0.20;
            double da = basic * 0.15;
            double tax = basic * 0.10;

            double netSalary = basic + hra + da - tax;

            System.out.println("HRA: " + hra);
            System.out.println("DA: " + da);
            System.out.println("Tax Deducted: " + tax);
            System.out.println("Net Salary: " + netSalary);
        }
    }


