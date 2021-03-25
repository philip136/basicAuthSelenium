import static org.testng.Assert.assertEquals;

import Forms.LoginForm;
import Utils.Constants.TestConsts;
import Utils.SettingsUtils;
import Utils.TestData;
import org.testng.annotations.Test;

public class BaseAuthTest extends BaseTest{
    private static final LoginForm loginForm = new LoginForm();
    private static final String loginUrl = SettingsUtils.getHomePageUrl();
    private static final String username = TestData.getUsername();
    private static final String password = TestData.getPassword();

    @Test
    public void testAuthorization() {
        browser.goTo(SettingsUtils.getAuthorizationUrl(loginUrl, username, password));
        browser.waitForPageToLoad();

        String expectedResult = String.format(TestConsts.expectedAuthResult, username);
        assertEquals(loginForm.getAuthResponse(), expectedResult, "Wrong JSON auth response");
    }
}
