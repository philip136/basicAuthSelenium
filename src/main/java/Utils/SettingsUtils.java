package Utils;

import Utils.Constants.JsonConstants;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.utilities.ISettingsFile;
import org.apache.hc.core5.net.URIBuilder;

import java.net.URISyntaxException;
import java.util.List;


public class SettingsUtils {
    public static String getHomePageUrl() {
        return AqualityServices.get(ISettingsFile.class).getValue(JsonConstants.pathToBaseUrl).toString();
    }

    public static String getAuthorizationUrl(String url, String username, String password) {
        try {
            URIBuilder uriBuilder = new URIBuilder(url);
            List<String> pathSegments = uriBuilder.getPathSegments();
            pathSegments.remove("");
            pathSegments.add(username);
            pathSegments.add(password);
            uriBuilder.setUserInfo(username, password).setPathSegments(pathSegments);
            url = uriBuilder.toString();
        } catch (URISyntaxException e) {
            AqualityServices.getLogger().error(e.getMessage());
        }
        return url;
    }
}
