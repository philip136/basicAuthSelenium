package Utils;

import Utils.Constants.JsonConstants;
import aquality.selenium.core.utilities.JsonSettingsFile;

public class TestData {
    private static final JsonSettingsFile jsonFile = new JsonSettingsFile(JsonConstants.pathToJsonTestData);

    public static String getUsername() {
        return jsonFile.getValue(JsonConstants.pathToUsername).toString();
    }

    public static String getPassword() {
        return jsonFile.getValue(JsonConstants.pathToPassword).toString();
    }
}
