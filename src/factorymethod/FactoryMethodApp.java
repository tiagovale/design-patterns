package factorymethod;

import factorymethod.concrete.creator.HtmlDialog;
import factorymethod.concrete.creator.WindowsDialog;
import factorymethod.creator.Dialog;

public class FactoryMethodApp {

	   private static Dialog dialog;

	    public static void main(String[] args) {
	        configure("Windows");
	        runBusinessLogic();
	    }


	    static void configure(String dialogSelector) {
	        if (dialogSelector.equals("Windows")) {
	            dialog = new WindowsDialog();
	        } else {
	            dialog = new HtmlDialog();
	        }
	    }

	    
	    static void runBusinessLogic() {
	        dialog.renderWindow();
	    }

}
