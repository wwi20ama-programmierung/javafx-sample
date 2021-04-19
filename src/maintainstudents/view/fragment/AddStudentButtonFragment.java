package maintainstudents.view.fragment;

import javafx.scene.Node;
import javafx.scene.control.Button;
import maintainstudents.view.IView;

public class AddStudentButtonFragment implements IView {

    private Button layoutRoot;

    public AddStudentButtonFragment() {
        init();
    }

    private void init() {
        this.layoutRoot = new Button("Hinzufügen");
    }

    @Override
    public Node getLayoutRoot() {
        return this.layoutRoot;
    }
}
