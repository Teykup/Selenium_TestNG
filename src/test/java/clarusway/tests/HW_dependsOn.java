package clarusway.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HW_dependsOn {

    //  Create tests that depend on each other
    //  Create beforeClass and set up settings.
    //  By creating interdependent tests;

    WebDriver driver;

    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void facebookTest() {
        driver.get("https://facebook.com");
    }

    @Test(dependsOnMethods = {"facebookTest"})
    public void googleTest() {
        driver.get("https://google.com");
    }

    @Test(dependsOnMethods = {"googleTest"})
    public void amazonTest() {
        driver.get("https://www.amazon.com/");
    }
}
