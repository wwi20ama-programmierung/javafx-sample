package maintainstudents.model;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private List<Student> studentList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
