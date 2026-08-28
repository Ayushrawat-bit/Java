public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "S001", 49);
        Student s2 = new Student("Bob", "S002", 50);
        Student s3 = new Student("Charlie", "S003", 79);

        s1.setMark(80);   
        s2.setMark(101);  
        s3.setMark(50);   

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
