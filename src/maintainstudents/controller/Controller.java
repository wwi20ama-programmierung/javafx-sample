package maintainstudents.controller;

import maintainstudents.view.IView;

public abstract class Controller {
    protected IView view;

    public Controller(IView view) {
        this.view = view;
    }
}
