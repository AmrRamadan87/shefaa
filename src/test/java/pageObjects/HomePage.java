package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);}

        @FindBy(id = "APjFqb")
        WebElement searchInput;


        public void EnteringInput () {
            searchInput.sendKeys("Lenovo laptop");
            searchInput.sendKeys(Keys.ENTER);
        }

    }

