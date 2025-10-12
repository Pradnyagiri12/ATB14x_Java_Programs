package Test_Java_Prog;

public class Prime_1_TO_100_15 {

        public static void main(String[] args) {
            System.out.println("Prime numbers from 1 to 100:");

            for (int n = 2; n <= 100; n++) {
                int count = 0; // counts divisors

                for (int i = 2; i * i <= n; i++) {
                    if (n % i == 0) {
                        count++;
                        break; // not prime, exit inner loop
                    }
                }

                if (count == 0) { // no divisors found
                    System.out.print(n + " ");
                }
            }
        }
    }


