import college.model.InvalidStudentDataException;

public class Week7Lab {

    public static void main(String[] args) {

        String[] values = {
            "85",
            "abc",
            "150"
        };

        for (String value : values) {

            try {

                int mark = Integer.parseInt(value);

                Student student = new Student("   aRnAv   gUpTa   ");
                student.setMark(mark);

                System.out.println("Valid: " + student);

            } catch (NumberFormatException e) {

                System.out.println("invalid mark: " + value
                        + " is not a number.");

            } catch (InvalidStudentDataException e) {

                System.out.println("invalid mark: " + value
                        + " - " + e.getMessage());

            } finally {

                System.out.println("validation attempt complete");
            }

            System.out.println();
        }
    }
}