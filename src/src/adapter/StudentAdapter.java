package adapter;

public class StudentAdapter implements Student{

    private SchoolStudent schoolStudent;

    public StudentAdapter(SchoolStudent schoolStudent) {
       this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getName();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getSurname();
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmail();
    }
}
