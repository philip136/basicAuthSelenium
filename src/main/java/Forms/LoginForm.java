package Forms;

import Utils.Constants.FormConstants;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import org.openqa.selenium.By;

public class LoginForm extends BaseForm {
    private final ILabel lblBody = AqualityServices.getElementFactory().getLabel(By.xpath("//body"), "Body text");

    public LoginForm() {
        super(By.xpath("/html"), FormConstants.loginFormName);
    }

    public String getAuthResponse() {
        return lblBody.getText()
                .replace("\n", "")
                .replace("\"", "")
                .replace(" ", "");
    }
}
