package adapter;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        SchoolStudent schoolStudent = new SchoolStudent();
        StudentAdapter studentAdapter = new StudentAdapter(schoolStudent);
        studentList.add(studentAdapter);
    }
}
