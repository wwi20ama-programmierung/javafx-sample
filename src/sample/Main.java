package sample;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
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

        Text text1 = new Text("Links");
        Text text2 = new Text("Mitte");
        Text text3 = new Text("Rechts");
        Text text4 = new Text("Unten");
        Text text5 = new Text("Oben");

        root.setLeft(text1);
        root.setCenter(text2);
        root.setRight(text3);
        root.setBottom(text4);
        root.setTop(text5);

        stage.setScene(scene);
    }
}
