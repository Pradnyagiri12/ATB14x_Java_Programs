package Test_Java_Prog;

public class Com_Log_Demo {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Comparison Operators
        System.out.println("Comparison Operators:");
        System.out.println("x == y: " + (x == y));   // false
        System.out.println("x != y: " + (x != y));   // true
        System.out.println("x < y: " + (x < y));     // true
        System.out.println("x > y: " + (x > y));     // false
        System.out.println("x <= y: " + (x <= y));   // true
        System.out.println("x >= y: " + (x >= y));   // false

        // Logical Operators
        System.out.println("\nLogical Operators:");

        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b));  // false
        System.out.println("a || b: " + (a || b));  // true
        System.out.println("!a: " + (!a));          // false
        System.out.println("!b: " + (!b));          // true

        // Combining comparison and logical operators
        System.out.println("\nCombined Comparison and Logical Operators:");
        System.out.println("(x < y) && (a == true): " + ((x < y) && (a == true))); // true
        System.out.println("(x > y) || (b == false): " + ((x > y) || (b == false))); // true
    }
}
