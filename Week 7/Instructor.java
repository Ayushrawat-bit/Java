public class Instructor extends Person {

    @Override
    public void describeRole() {
        System.out.println("a am an instructor");
    }

    public void conductClass() {
        System.out.println("instructor is taking a class");
    }
}