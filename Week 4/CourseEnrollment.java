public class CourseEnrollment {
    public static void main(String[] args) {

        Course c1 = new Course("CSE101", "Intro to CS", 2);

        System.out.println("Withdraw from empty: " + c1.withdraw()); 

        System.out.println("Enroll 1: " + c1.enroll()); 
        System.out.println("Enroll 2: " + c1.enroll()); 
        System.out.println("Enroll over capacity: " + c1.enroll()); 

        Course c2 = new Course("MTH201", "Calculus", 3);
        c2.enroll();
        c2.enroll();
        System.out.println("One seat remaining: " + c2);

        c2.enroll();
        System.out.println("Full course: " + c2);

        System.out.println("Withdraw valid: " + c2.withdraw());
        System.out.println("Withdraw again: " + c2.withdraw());
        System.out.println("Withdraw until empty: " + c2.withdraw());
        System.out.println("Withdraw from empty: " + c2.withdraw()); 

        System.out.println(c1);
        System.out.println(c2);
    }
}
