import java.util.Scanner;

public class NumberAnalyzer {
    static int readNumber(Scanner input) {
        System.out.print("Enter an integer: ");
        return input.nextInt();
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isPositive(int number) {
        return number > 0;
    }

    static int absoluteValue(int number) {
        return (number < 0) ? -number : number;
    }

    static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number > 0) {
            count++;
            number = number / 10;
        }
        return count;
    }

    static int sumDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    static void printReport(int number, boolean even, boolean positive,
        int digitCount, int digitSum) {
        System.out.println("Analysis Report:");
        System.out.println("Number: " + number);
        System.out.println("Even? " + even);
        System.out.println("Positive? " + positive);
        System.out.println("Digit count: " + digitCount);
        System.out.println("Digit sum: " + digitSum);
    }

    static int analyzeMagnitude(int number) {
        int abs = absoluteValue(number);
        return countDigits(abs);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = readNumber(input);
        boolean even = isEven(number);
        boolean positive = isPositive(number);
        int abs = absoluteValue(number);
        int digitCount = countDigits(abs);
        int digitSum = sumDigits(abs);

        printReport(number, even, positive, digitCount, digitSum);
        input.close();
    }
}
