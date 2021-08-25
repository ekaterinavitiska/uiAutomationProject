package pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilities {


    public static String getPropValueByName(String propertyName) {
        FileInputStream fis;
        Properties property = new Properties();
        String propertyValue = "";

        try {
            fis = new FileInputStream("project.properties");
            property.load(fis);

            propertyValue = property.getProperty(propertyName);


        } catch (IOException e) {
            System.err.println("No File");
        }
        return propertyValue;
    }
}
