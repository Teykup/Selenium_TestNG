package clarusway.tests.HW;

import clarusway.utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HW_softAssert2 extends BaseTest {

    @Test
    public void softtest2 (){


       // Test Case3: Negative Password Test
       // Open page https://practicetestautomation.com/practice-test-login/
        driver.get("https://practicetestautomation.com/practice-test-login/");

       // Type username student into Username field.
        WebElement Username = driver.findElement(By.xpath("//input[@id='username']"));
        Username.sendKeys("student");

       // Type password incorrectPassword into Password field.
        WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("incorrectPassword");

       // Puch Submit button.
        WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
        Submit.click();

       // Verify error message is displayed.
        SoftAssert softAssert1 = new SoftAssert();
        WebElement error1 = driver.findElement(By.xpath("//div[@id='error']"));
        softAssert1.assertTrue(error1.isDisplayed(),"error");

       // Verify error message text is Your password is invalid!
        SoftAssert softAssert2 = new SoftAssert();
        WebElement error2 = driver.findElement(By.xpath("//div[@id='error']"));
        softAssert2.assertTrue(error2.getText().contains("Your password is invalid!"),"error");

    }
}
