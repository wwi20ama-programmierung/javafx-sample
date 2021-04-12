package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Text-Objekt erzeugen und konfigurieren
        Text someText = new Text();
        someText.setText("Hello World!");
        someText.setFont(new Font(52.0));
        someText.setX(50.0);
        someText.setY(100.0);

        // Event-Handler (Maus-Klick) für Text-Objekt definieren
        EventHandler<MouseEvent> eventHandler = new EventHandler() {
            @Override
            public void handle(Event event) {
                System.out.println("Source: " + event.getSource().getClass() + ", Target: " + event.getTarget().getClass() + ". Der Text wurde angeklickt!");
            }
        };
        someText.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

        // Root-Knoten erzeugen und Text-Objekt hinzufügen
        Group group = new Group();
        ObservableList groupChildren = group.getChildren();
        groupChildren.add(someText);

        // Szene erzeugen und hinzufügen
        Scene scene1 = new Scene(group, 1000.0, 1000.0);
        primaryStage.setScene(scene1);
        // Zum Testen verwenden wir den Text-Event-Handler auch für die Szene
        // Erkenntnis: Sowohl für die Szene als auch für das Text-Element wird das Event ausgelöst
        scene1.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);

        addLayouts(primaryStage);

        // Titel des Fensters ändern
        primaryStage.setTitle("Beispielapplikation zur Vorlesung am 09.04.2021");

        // Fenster anzeigen
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("Hello World");
        launch(args);
    }

    public static void addLayouts(Stage stage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1000, 500);

        Text text2 = new Text("Mitte");
        Text text5 = new Text("Oben");

        root.setCenter(text2);
        root.setTop(text5);

        // Texte in der linken Sidebar des Layouts anzeigen
        VBox leftSideBarVBox = new VBox();
        leftSideBarVBox.setSpacing(10.0);

        Text sidebarText1 = new Text("Element 1");
        Text sidebarText2 = new Text("Element 2");

        leftSideBarVBox.getChildren().addAll(sidebarText1, sidebarText2);

        root.setLeft(leftSideBarVBox);

        // Buttons im Footer des Layouts anzeigen
        HBox buttonHBox = new HBox();
        buttonHBox.setSpacing(15.0);

        Button addButton = new Button("Hinzufügen");
        Button deleteButton = new Button("Löschen");

        buttonHBox.getChildren().addAll(addButton, deleteButton);

        // FlowPane in der rechten Sidebar anzeigen
        FlowPane rightSidebarFlowPane = new FlowPane();

        ObservableList children = rightSidebarFlowPane.getChildren();

        Image image = new Image("https://github.com/wwi20ama-programmierung/java-intro/raw/master/Zusammenfassung/includes/Vererbung.png");

        for (int i = 0; i < 5; i++) {
            ImageView imageView = new ImageView();
            imageView.setImage(image);
            imageView.setFitWidth(100);
            imageView.setFitHeight(100);
            children.add(imageView);
        }

        // root.setRight(rightSidebarFlowPane);

        // Tabelle in der linken Sidebar anzeigen
        addTableView(root);

        root.setBottom(buttonHBox);

        stage.setScene(scene);
    }

    public static void addTableView(BorderPane root) {
        TableView tableView = new TableView();

        // Spalten hinzufügen
        ObservableList<TableColumn> tableColumns = tableView.getColumns();
        TableColumn tableColumnFirstname = new TableColumn();
        tableColumnFirstname.setText("Vorname");

        TableColumn tableColumnLastname = new TableColumn();
        tableColumnLastname.setText("Nachname");

        tableColumns.addAll(tableColumnFirstname, tableColumnLastname);

        // tableView.getItems();

        root.setLeft(tableView);

    }
}
