package StudentBuilder;

import java.util.ArrayList;
import java.util.List;
import Student.Student;

public abstract class StudentBuilder {
    String name;
    int id;
    String address;
    List<String> subjects;
    int level;

    public StudentBuilder() {
        subjects = new ArrayList<String>();
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public abstract StudentBuilder setSubjects();

    public StudentBuilder setLevel(int level) {
        this.level = level;
        return this;
    }

    public Student build() {
        return new Student(this);
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public String getAddress() {
        return this.address;
    }

    public List<String> getSubjects() {
        return this.subjects;
    }

    public int getLevel() {
        return this.level;
    }

}
