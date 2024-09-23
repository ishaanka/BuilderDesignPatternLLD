package Student;

import StudentBuilder.StudentBuilder;

import java.util.List;

public class Student {
    String name;
    int id;
    String address;
    List<String> subjects;
    int level;


    public Student(StudentBuilder studentBuilder) {
        this.name = studentBuilder.getName();
        this.id = studentBuilder.getId();
        this.address = studentBuilder.getAddress();
        this.subjects = studentBuilder.getSubjects();
        this.level = studentBuilder.getLevel();
    }
}
