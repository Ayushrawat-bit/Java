import java.util.Scanner;

public class MarksProcessor {
    public static boolean isValidMark(int mark) {
        return mark >= 0 && mark <= 100;
    }
    public static double calculateAverage(int sum, int count) {
        if (count == 0) {
            return 0; 
        }
        return (double) sum / count;
    }

    public static void printResults(int count, int sum, double average, int highest, int passes, int failures) {
        System.out.println("Number of valid marks: " + count);
        System.out.println("Sum of marks: " + sum);
        System.out.println("Average mark: " + average);
        System.out.println("Highest mark: " + highest);
        System.out.println("Number of passes: " + passes);
        System.out.println("Number of failures: " + failures);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int highest = -1; 
        int passes = 0;
        int failures = 0;

        System.out.println("Enter marks (-1 to stop):");
        int mark;
        do {
            mark = input.nextInt();

            if (mark == -1) {
                break; 
            }
            if (isValidMark(mark)) {
                count++;
                sum += mark;
                if (mark > highest) {
                    highest = mark;
                }
                if (mark >= 50) {
                    passes++;
                } else {
                    failures++;
                }
            } else {
                System.out.println("Invalid mark, ignored.");
            }
        } while (true);
        double average = calculateAverage(sum, count);
        printResults(count, sum, average, highest, passes, failures);
    }
}
