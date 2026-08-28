public class Course {

    private String courseCode;
    private String title;
    private int capacity;
    private int enrolled;
    
    public Course(String courseCode, String title, int capacity) {
        this.courseCode = (courseCode == null || courseCode.isBlank()) ? "N/A" : courseCode;
        this.title = (title == null || title.isBlank()) ? "Untitled" : title;
        this.capacity = (capacity > 0) ? capacity : 1;
        this.enrolled = 0;
    }
    public boolean enroll() {
        if (enrolled < capacity) {
            enrolled++;
            return true;
        }
        return false; 
    }
    public boolean withdraw() {
        if (enrolled > 0) {
            enrolled--;
            return true;
        }
        return false; 
    }
    public boolean isFull() {
        return enrolled >= capacity;
    }
    public int getAvailableSeats() {
        return capacity - enrolled;
    }
    public String toString() {
        return "Course{code='" + courseCode + "', title='" + title +
               "', capacity=" + capacity + ", enrolled=" + enrolled +
               ", available=" + getAvailableSeats() + ", full=" + isFull() + "}";
    }
}
