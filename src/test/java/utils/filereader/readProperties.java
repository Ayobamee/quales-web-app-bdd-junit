package utils.filereader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readProperties {
    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("src/test/java/resources/testdata.properties");



    public readProperties() throws FileNotFoundException {
    }

    public Object  getUsername() throws IOException {
        prop.load(fis);
        return prop.getProperty("username");

    }


    public Object getPassword() throws IOException {
        prop.load(fis);
        return prop.getProperty("password");


    }
}
