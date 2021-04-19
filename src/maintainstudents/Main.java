package maintainstudents;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import maintainstudents.controller.MainController;
import maintainstudents.model.DataProvider;
import maintainstudents.model.Student;
import maintainstudents.view.fragment.DetailFragment;
import maintainstudents.view.MainView;
import maintainstudents.view.fragment.MasterFragment;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // addLayouts(primaryStage);

        DataProvider dataProvider = new DataProvider();

        // Zum Testen mehrere Studierende in die Liste hinzufügen
        dataProvider.getStudentList().add(new Student("Max" ,"Mustermann", "max.mustermann@email.com", "Eine Straße 123, 12345 Musterstadt", 12156));
        dataProvider.getStudentList().add(new Student("Erika" ,"Mustermann", "erika.mustermann@email.com", "Eine andere Straße 45, 12345 Musterstadt", 78978));
        dataProvider.getStudentList().add(new Student("Anna" ,"Mustermann", "anna.mustermann@email.com", "Anderer Weg 79, 12345 Musterstadt", 72114));

        MainView mainView = new MainView(primaryStage);
        mainView.setContentLeft(new MasterFragment().getLayoutRoot());
        mainView.setContentCenter(new DetailFragment().getLayoutRoot());

        MainController mainController = new MainController(mainView, dataProvider);

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
