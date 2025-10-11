package Home_Work_Prog;

public class Second_Maximum {
            public static void main(String[] args) {
            int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};

            int firstMax = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > firstMax) {
                    secondMax = firstMax;
                    firstMax = numbers[i];
                } else if (numbers[i] > secondMax && numbers[i] != firstMax) {
                    secondMax = numbers[i];
                }
            }

            System.out.println("Second Maximum Number: " + secondMax);
        }
    }

