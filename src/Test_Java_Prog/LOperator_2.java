package Test_Java_Prog;

public class LOperator_ {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer division)
        System.out.println("a % b = " + (a % b)); // Modulus (remainder)

        // Assignment Operators
        System.out.println("\nAssignment Operators:");

        int c = 10;
        System.out.println("Initial c = " + c);

        c += 5; // c = c + 5
        System.out.println("After c += 5: " + c);

        c -= 3; // c = c - 3
        System.out.println("After c -= 3: " + c);

        c *= 2; // c = c * 2
        System.out.println("After c *= 2: " + c);

        c /= 4; // c = c / 4
        System.out.println("After c /= 4: " + c);
    }
}
