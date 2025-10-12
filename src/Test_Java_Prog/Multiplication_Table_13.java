package Test_Java_Prog;

public class Multiplication_Table_13 {

        public static void main(String[] args) {

            for (int i = 1; i <= 5; i++) {           // Outer loop: table number
                System.out.println("Multiplication Table of " + i + ":");

                for (int j = 1; j <= 10; j++) {      // Inner loop: multiplier
                    System.out.println(i + " x " + j + " = " + (i * j));
                }

                System.out.println(); // Empty line between tables
            }
        }
    }



