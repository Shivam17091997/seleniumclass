package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static java.awt.SystemColor.text;

public class GooglePage {
    WebDriver driver;
    public GooglePage(WebDriver driver){
        this.driver=driver;
    }
      @FindBy(name="q")
      WebElement searchBox;

    public void openGoogle(){
        driver.get("https://www.google.com");
    }
    public void entersearch(String text){
        searchBox.sendKeys(text);
    }

    public void submitSearch(){
        searchBox.submit();
    }
}
//Page class = "All elements + actions of one page"