package factorymethod.concrete.creator;

import factorymethod.concrete.product.HtmlButton;
import factorymethod.creator.Dialog;
import factorymethod.interfaces.Button;

public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}