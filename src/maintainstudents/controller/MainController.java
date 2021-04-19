package maintainstudents.controller;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import maintainstudents.model.DataProvider;
import maintainstudents.model.Student;
import maintainstudents.view.MainView;
import maintainstudents.view.fragment.AddStudentButtonFragment;

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
        addButtonClickListener();
    }

    private void addButtonClickListener() {
        MainView mainView = (MainView) this.view;
        Button addButton = (Button) mainView.getContentFooter();


        addButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                // Neues Student-Objekt hinzufügen
                Student student = new Student("Else", "Mustermann", "Eine Straße 123, 54587 Musterstadt", "else@mustermann.de", 54899);
                dataProvider.addStudent(student);
            }
        });
    }

    private void addTableClickListeners() {
        MainView mainView = (MainView) this.view;
        TableView tableView = (TableView) mainView.getContentLeft();

        if (tableView != null) {
            tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    // int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
                    Student selectedStudent = (Student) tableView.getSelectionModel().getSelectedItem();
                    // Bei einem Klick auf leere Zeilen ist selectedStudent == null
                    if (selectedStudent != null) {

                    }
                }
            });
        }
    }
}
