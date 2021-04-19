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
    }

    @Override
    public Node getLayoutRoot() {
        return this.layoutRoot;
    }
}
