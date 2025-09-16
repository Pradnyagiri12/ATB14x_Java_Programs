public class tableOfNine {
    public static void main(String[] args) {
        int number = 9;
        System.out.println("Multiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }
}
