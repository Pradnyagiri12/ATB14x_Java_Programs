package Test_Java_Prog;

public class Increment_Decrement {

    public static void main(String[] args) {
        int i = 10;

        System.out.println("Initial value of i: " + i);

        //  Pre-Increment (++i)
        int preInc = ++i; // increases i first, then uses it
        System.out.println("\nAfter Pre-Increment (++i):");
        System.out.println("Value returned: " + preInc);
        System.out.println("Current value of i: " + i);

        //  Post-Increment (i++)
        int postInc = i++; // uses i first, then increases it
        System.out.println("\nAfter Post-Increment (i++):");
        System.out.println("Value returned: " + postInc);
        System.out.println("Current value of i: " + i);

        //  Pre-Decrement (--i)
        int preDec = --i; // decreases i first, then uses it
        System.out.println("\nAfter Pre-Decrement (--i):");
        System.out.println("Value returned: " + preDec);
        System.out.println("Current value of i: " + i);

        //  Post-Decrement (i--)
        int postDec = i--; // uses i first, then decreases it
        System.out.println("\nAfter Post-Decrement (i--):");
        System.out.println("Value returned: " + postDec);
        System.out.println("Current value of i: " + i);
    }
}


