package maintainstudents.controller;

import javafx.event.EventHandler;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import maintainstudents.model.DataProvider;
import maintainstudents.model.Student;
import maintainstudents.view.MainView;

public class MainController extends Controller {
    private DataProvider dataProvider;

    public MainController(MainView view) {
        super(view);
    }

    public MainController(MainView view, DataProvider dataProvider) {
        super(view);
        this.dataProvider = dataProvider;

        MainView mainView = (MainView) this.view;
        TableView tableView = (TableView) mainView.getContentLeft();

        // Wir setzen die ObservableList aus dem DataProvider als Items in der TableView (= Binding)
        tableView.setItems(this.dataProvider.getStudentList());

        addTableClickListeners();
    }

    private void addTableClickListeners() {
        MainView mainView = (MainView) this.view;
        TableView tableView = (TableView) mainView.getContentLeft();

        DataProvider dataProvider = this.dataProvider;

        if(tableView != null) {
            tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    // int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
                    Student selectedStudent = (Student) tableView.getSelectionModel().getSelectedItem();
                    // Bei einem Klick auf leere Zeilen ist selectedStudent == null
                    if(selectedStudent != null) {
                        selectedStudent.setFirstname("Test");
                        dataProvider.addStudent(selectedStudent);
                    }
                }
            });
        }
    }
}
