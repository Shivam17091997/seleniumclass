package Stepdefinition;

import Pages.Login;
import Utils.ConfigReader;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;

import static Pages.BaseClass.driver;

public class TestingFile {
    ConfigReader configReader = new ConfigReader();
    Login login=new Login(driver);
      //  Login.username(configReader.getuser());
     //   Login.password(configReader.getpass());
}
