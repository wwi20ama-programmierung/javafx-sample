package maintainstudents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import maintainstudents.view.fragment.DetailFragment;
import maintainstudents.view.MainView;
import maintainstudents.view.fragment.MasterFragment;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // addLayouts(primaryStage);

        MainView mainView = new MainView(primaryStage);
        mainView.setContentLeft(new MasterFragment().getLayoutRoot());
        mainView.setContentCenter(new DetailFragment().getLayoutRoot());

        // Titel des Fensters ändern
        primaryStage.setTitle("Beispielapplikation zur Vorlesung am 09.04.2021");

        // Fenster anzeigen
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static void addLayouts(Stage stage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1000, 500);

        // Buttons im Footer des Layouts anzeigen
        HBox buttonHBox = new HBox();
        buttonHBox.setSpacing(15.0);

        Button addButton = new Button("Hinzufügen");
        Button deleteButton = new Button("Löschen");

        buttonHBox.getChildren().addAll(addButton, deleteButton);

        root.setBottom(buttonHBox);

        stage.setScene(scene);
    }
}
