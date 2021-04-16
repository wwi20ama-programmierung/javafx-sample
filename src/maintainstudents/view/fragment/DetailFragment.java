package maintainstudents.view.fragment;

import javafx.scene.Node;
import maintainstudents.view.IView;

public class DetailFragment implements IView {

    private Node layoutRoot;

    public DetailFragment() {
        init();
    }

    private void init() {
        // StudentDetailsLayout initialisieren und in der Mitte der BorderPane einhängen
        StudentDetailsFragment studentDetailsFragment = new StudentDetailsFragment();

        this.layoutRoot = studentDetailsFragment.getLayoutRoot();
    }

    @Override
    public Node getLayoutRoot() {
        return this.layoutRoot;
    }
}
