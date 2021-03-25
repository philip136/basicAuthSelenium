import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected final Browser browser = AqualityServices.getBrowser();

    @BeforeClass
    protected void beforeClass() {
        browser.maximize();
    }

    @AfterClass
    protected void afterClass() {
        browser.quit();
    }
}
