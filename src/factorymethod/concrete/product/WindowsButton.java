package factorymethod.concrete.product;

import factorymethod.interfaces.Button;

public class WindowsButton implements Button {

    public void render() {
        System.out.println("Windows Button");
        onClick();
    }

    public void onClick() {
        System.out.println("Click! Button says - 'Hello World from Windows!'");
    }
}