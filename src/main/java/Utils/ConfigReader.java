package Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    Properties prop;
    public ConfigReader(){
        try {
            FileInputStream fis= new FileInputStream("src/test/resources/config.properties");
            prop = new Properties();
            prop.load(fis);
        }
        catch(Exception e){
            System.out.println("Error loading config.properties");
            e.printStackTrace();

        }
    }
    public String geturl(){
        return prop.getProperty("url");
    }
    public String getuser(){
        return prop.getProperty("user");
    }
    public String getpass(){
        return prop.getProperty("pass");
    }
}
