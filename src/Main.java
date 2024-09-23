import StudentBuilder.StudentBuilder;
import StudentBuilder.EnggStudentBuilder;
import Student.Student;

public class Main {
    public static void main(String[] args) {
        Student st = new EnggStudentBuilder().setAddress("Faridabad").setId(1).setLevel(10).setSubjects().build();
    }
}