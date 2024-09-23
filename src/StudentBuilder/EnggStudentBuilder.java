package StudentBuilder;

public class EnggStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        subjects.add("DBMS");
        subjects.add("DSA");
        subjects.add("LLD");
        return this;
    }
}
