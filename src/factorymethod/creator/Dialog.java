package factorymethod.creator;

import factorymethod.interfaces.Button;

public abstract class Dialog {

    public void renderWindow() {

        Button okButton = createButton();
        okButton.render();
    }


    public abstract Button createButton();
}