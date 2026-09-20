public class Student extends Person {

    @Override
    public void describeRole() {
        System.out.println("i am a student");
    }

    public void submitAssignment() {
        System.out.println("Student submitted week 7 assignment");
    }
}