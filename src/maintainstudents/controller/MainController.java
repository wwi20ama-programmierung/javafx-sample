package maintainstudents.controller;

import javafx.event.EventHandler;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import maintainstudents.view.MainView;

public class MainController extends Controller {
    public MainController(MainView view) {
        super(view);

        addTableClickListeners();
    }

    private void addTableClickListeners() {
        MainView mainView = (MainView) this.view;
        TableView tableView = (TableView) mainView.getContentLeft();

        if(tableView != null) {
            tableView.setOnMouseClicked(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent event) {
                    // int selectedIndex = tableView.getSelectionModel().getSelectedIndex();
                    Object selectedItem = tableView.getSelectionModel().getSelectedItem();
                    System.out.println(selectedItem);
                }
            });
        }
    }
}
