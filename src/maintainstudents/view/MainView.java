package maintainstudents.view;

import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView implements IView {

    private static final int SCENE_HEIGHT = 720;
    private static final int SCENE_WIDTH = 1280;
    private Stage stage;
    private BorderPane layoutRoot;

    public MainView(Stage stage) {
        this.stage = stage;
        init();
    }

    private void init() {
        BorderPane borderPane = new BorderPane();
        this.layoutRoot = borderPane;
        Scene scene = new Scene(borderPane, SCENE_WIDTH, SCENE_HEIGHT);

        this.stage.setScene(scene);
    }

    public void setContentLeft(Node node) {
        this.layoutRoot.setLeft(node);
    }

    public void setContentRight(Node node) {
        this.layoutRoot.setRight(node);
    }

    public void setContentCenter(Node node) {
        this.layoutRoot.setCenter(node);
    }

    public void setContentFooter(Node node) {
        this.layoutRoot.setBottom(node);
    }

    public Node getContentLeft() {
        return this.layoutRoot.getLeft();
    }

    public Node getContentFooter() {
        return this.layoutRoot.getBottom();
    }

    @Override
    public Node getLayoutRoot() {
        return this.layoutRoot;
    }
}
