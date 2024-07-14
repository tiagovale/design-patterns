package factorymethod.concrete.creator;

import factorymethod.concrete.product.WindowsButton;
import factorymethod.creator.Dialog;
import factorymethod.interfaces.Button;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}