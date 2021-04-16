package maintainstudents.view.fragment;

import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import maintainstudents.model.Student;
import maintainstudents.view.IView;

public class StudentDetailsFragment implements IView {
    private Text firstnameText;
    private Text lastnameText;
    private Text postalAddressText;
    private Text emailText;
    private Text matriculationNumberText;
    private VBox layoutRoot;

    public StudentDetailsFragment() {
        init();
    }

    /**
     * Layout zusammenbauen
     */
    private void init() {
        this.layoutRoot = new VBox();

        this.firstnameText = new Text();
        this.lastnameText = new Text();
        this.postalAddressText = new Text();
        this.emailText = new Text();
        this.matriculationNumberText = new Text();

        ObservableList vBoxChildren = layoutRoot.getChildren();
        vBoxChildren.addAll(this.firstnameText, this.lastnameText, this.postalAddressText, this.emailText, this.matriculationNumberText);
    }

    public void setStudent(Student student) {
        // Alle UI-Elemente aktualisieren
        this.firstnameText.setText(student.getFirstname());
        this.lastnameText.setText(student.getLastname());
        this.postalAddressText.setText(student.getPostalAddress());
        this.emailText.setText(student.getEmail());
        this.matriculationNumberText.setText(String.valueOf(student.getMatriculationNumber()));
        // this.matriculationNumberText.setText(Integer.toString(student.getMatriculationNumber()));
    }

    public VBox getLayoutRoot() {
        return this.layoutRoot;
    }
}
