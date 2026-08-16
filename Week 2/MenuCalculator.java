import java.util.Scanner;

public class MenuCalculator {
    public static void printMenu() {
        System.out.println("1 for Addition");
        System.out.println("2 for Subtraction");
        System.out.println("3 for Multiplication");
        System.out.println("4 for Division");
        System.out.println("0 to Exit");
    }
    public static float calculate(int choice, float n1, float n2) {
        switch (choice) {
            case 1:
                return n1 + n2;
            case 2:
                return n1 - n2;
            case 3:
                return n1 * n2;
            case 4:
                if (n2 == 0) {
                    System.out.println("Number can't be divided by zero");
                    return 0; 
                } else {
                    return n1 / n2;
                }
            default:
                System.out.println("Invalid choice");
                return 0; 
        }
    }
    public void calculator() {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            printMenu();
            System.out.print("Enter choice: ");
            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Calculator closes here!");
                break;
            }
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                float n1 = input.nextFloat();

                System.out.print("Enter second number: ");
                float n2 = input.nextFloat();

                float result = calculate(choice, n1, n2);
                System.out.println("Result: " + result);
            } else {
                System.out.println("Invalid choice, try again.");
            }
        } while (choice != 0);
    }
}
