package maintainstudents.view.fragment;

import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import maintainstudents.view.IView;

public class MasterFragment implements IView {

    private TableView layoutRoot;

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
