package Forms;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class BaseForm extends Form {
    protected BaseForm(By locator, String name) {
        super(locator, name);
    }

    public final IElementFactory getElementFactory() {
        return AqualityServices.getElementFactory();
    }

}
