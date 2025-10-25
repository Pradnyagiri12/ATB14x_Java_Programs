package Home_Work_Prog;import java.util.Scanner;
class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter side1: ");
        int a = s.nextInt();
        System.out.print("Enter side2: ");
        int b = s.nextInt();
        System.out.print("Enter side3: ");
        int c = s.nextInt();

        if(a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Not a Valid Triangle");
        }
    }
}


