package StudentBuilder;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        subjects.add("Marketing");
        subjects.add("Strategy");
        subjects.add("Finance");
        return this;
    }
}
