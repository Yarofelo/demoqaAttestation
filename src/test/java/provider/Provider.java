package provider;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Provider {
    private final static String UrlProperties = "src/main/resources/properties";
    private final static String Url = "url.";

    private final static String LoginProperties = "src/main/resources/properties";
    private final static String User = "user";
    private final static String Password = "password";

    public static String getUrlFromProperties(pages.Url page) {
        return getLinks(Url + page.toString());
    }

    private static String getLinks(String page) {
        File propertiesFile = new File(UrlProperties);
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(propertiesFile));
            return properties.getProperty(page);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getUserName() {
        return getAuthDataFromFile(User);
    }

    public static String getPassword() {
        return getAuthDataFromFile(Password);
    }

    private static String getAuthDataFromFile(String page) {
        File propertiesFile = new File(LoginProperties);
        Properties properties = new Properties();
        try {
            properties.load(new FileReader(propertiesFile));
            return properties.getProperty(page);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}