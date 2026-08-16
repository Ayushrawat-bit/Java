public class GradingSystem {

    public static String classifyMark(int marks) {
        if (marks <= 100 && marks >= 80) {
            return "Distinction";
        } else if (marks < 80 && marks >= 70) {
            return "Merit";
        } else if (marks < 70 && marks >= 50) {
            return "Pass";
        } else if (marks < 50 && marks >= 0) {
            return "Fail";
        } else {
            return "Incorrect marks";
        }
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = input.nextInt();

        String result = classifyMark(marks);
        System.out.println(result);
    }
}
