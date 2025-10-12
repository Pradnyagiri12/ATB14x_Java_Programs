package Test_Java_Prog;

public class Type_casting_Prog5 {
    public static void main(String[] args) {

        // ===== Operator Precedence Example =====
        int a = 10, b = 5, c = 2;

        int result1 = a + b * c;      // * has higher precedence than +
        int result2 = (a + b) * c;    // () changes the order

        System.out.println("a + b * c = " + result1);     // 10 + (5*2) = 20
        System.out.println("(a + b) * c = " + result2);   // (10+5)*2 = 30


        // ===== Type Casting Example =====
        int x = 10;
        double y = x;   // Implicit casting (int → double)
        System.out.println("\nImplicit Casting: int 10 → double = " + y);

        double d = 9.78;
        int z = (int) d;  // Explicit casting (double → int)
        System.out.println("Explicit Casting: double 9.78 → int = " + z);
    }
}
