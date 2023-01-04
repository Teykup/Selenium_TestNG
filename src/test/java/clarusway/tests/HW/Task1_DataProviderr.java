package clarusway.tests.HW;


import clarusway.utilities.BaseCrossBrowserTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task1_DataProviderr extends BaseCrossBrowserTest {
    /*
    Go to URL: https://opensourcedemo.orangehrmlive.com/
Login with negative credentials by Data Provider.
Then assert that ‘’Invalid credentials’’ is displayed.
     */

    @Test (dataProvider = "data")
    public void testDataProvider(String username, String password) {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement user=driver.findElement(By.name("username"));

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(user)); -webelement

        actions.click(wait.until(ExpectedConditions.elementToBeClickable(user))).sendKeys(username + Keys.TAB)
                .sendKeys(password+Keys.ENTER).perform();

        // LOGIN kısmında type = submit ise keys.enter kullanabiliriz, yoksa kullanamayız

        WebElement invalid=driver.findElement(By.xpath("//*[text()='Invalid credentials']"));

        // WebElement alertMessage = driver.findElement(By.className("oxd-alert-content"));

        Assert.assertTrue(invalid.isDisplayed());

    }

        
    @DataProvider
    public Object [][] data(){

        return new Object [][] {
                {"qwerty", "password34"},
                {"ebikGabık" ,"erzincan24"},
                {"cuneytCakici" , "EfsaneADAAMMMMMM"}
        };
    }
}
