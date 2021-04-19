package maintainstudents.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataProvider {
    // Neue Observable List für Studierenden-Objekte erzeugen
    private ObservableList<Student> studentList = FXCollections.observableArrayList();

    public ObservableList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ObservableList<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }
}
