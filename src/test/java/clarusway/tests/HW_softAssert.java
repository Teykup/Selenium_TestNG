package clarusway.tests;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HW_softAssert extends BaseTest {

    @Test
    public void softTest(){

        // Test Case2: Negative Username Test
        // Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Type username incorrectUser into Username field.
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("incorrectUser");

        // Type password Password123 into Password field.
        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("Password123");

        // Puch Submit button.
        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
        Submit.click();

        // Verify error message is displayed.
        SoftAssert softAssert1 = new SoftAssert();
        WebElement error1 = driver.findElement(By.xpath("//div[@id='error']"));
        softAssert1.assertTrue(error1.isDisplayed(),"error");

        // Verify error message text is Your username is invalid!
        SoftAssert softAssert2 = new SoftAssert();
        WebElement error2 = driver.findElement(By.xpath("//div[@id='error']"));
        softAssert2.assertTrue(error2.getText().contains("Your username is invalid!"),"error");


    }
}
