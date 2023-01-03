package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HW_hardAssert  extends BaseTest {


    @Test
    public void hardAssert() {
        // Test Case1: Positive Login Test
        // Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username student into Username field
        WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
        Username.sendKeys("student");

        // Type password Password123 into Password field
        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Password123");

        // Puch Submit button.
        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
        Submit.click();

        // Verify new page URL contains practicetestautomation.com/logged-in-successfully/
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        // Verify new page contains expected text ('Congratulations' or 'successfully logged in')
        Assert.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));

        // Verify button Log out is displayed on the new page.
        WebElement logOut = driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']"));
        Assert.assertTrue(logOut.getText().contains("Log out"));

    }
}

