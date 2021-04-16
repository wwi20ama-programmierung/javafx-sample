package maintainstudents.view.fragment;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import maintainstudents.model.Student;
import maintainstudents.view.IView;

public class MasterFragment implements IView {

    private Node layoutRoot;

    public MasterFragment() {
        init();
    }

    private void init() {
        TableView tableView = new TableView();

        // Spalte für "Vorname" hinzufügen
        ObservableList<TableColumn> tableColumns = tableView.getColumns();
        TableColumn tableColumnFirstname = new TableColumn();
        tableColumnFirstname.setText("Vorname");
        tableColumnFirstname.setCellValueFactory(new PropertyValueFactory<>("firstname"));

        // Spalte für "Nachname" hinzufügen
        TableColumn tableColumnLastname = new TableColumn();
        tableColumnLastname.setText("Nachname");
        tableColumnLastname.setCellValueFactory(new PropertyValueFactory<>("lastname"));

        tableColumns.addAll(tableColumnFirstname, tableColumnLastname);

        // Zeilen hinzufügen
        ObservableList tableRows = tableView.getItems();

        Student student1 = new Student("Max" ,"Mustermann", "max.mustermann@email.com", "Eine Straße 123, 12345 Musterstadt", 12156);
        Student student2 = new Student("Erika" ,"Mustermann", "erika.mustermann@email.com", "Eine andere Straße 45, 12345 Musterstadt", 78978);
        Student student3 = new Student("Anna" ,"Mustermann", "anna.mustermann@email.com", "Anderer Weg 79, 12345 Musterstadt", 72114);

        tableRows.addAll(student1, student2, student3);

        this.layoutRoot = tableView;

        /*tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
                Student selectedItem = (Student) tableView.getSelectionModel().getSelectedItem();
                studentDetailsLayout.setStudent(selectedItem);
                // Object getSelectedItem = tableRows.get(selectedIndex);
            }
        });*/
    }

    @Override
    public Node getLayoutRoot() {
        return this.layoutRoot;
    }
}
