package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import testBase.Baseclass;

public class SearchingAbout extends Baseclass {

    @Test
    public void Search() throws InterruptedException {
        HomePage HO = new HomePage(driver);
        HO.EnteringInput();
        String actualTitle = "Lenovo laptop - بحث Google‏";
        String ExpectedTile = driver.getTitle();

        Assert.assertEquals(ExpectedTile, actualTitle, "Incorrect page title");


    }


}
