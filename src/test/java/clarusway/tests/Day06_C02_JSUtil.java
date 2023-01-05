package clarusway.tests;

import clarusway.utilities.BaseCrossBrowserTest;
import clarusway.utilities.JSUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Day06_C02_JSUtil extends BaseCrossBrowserTest {

    @Test
    public void test() throws InterruptedException {
        JSUtils.driver = driver;

        driver.get("https://www.amazon.com/");

        JSUtils.scrollIntoViewJS( driver.findElement(By.partialLinkText("Amazon Ignite")));

        // Debug amacli
        Thread.sleep(4000);

        JSUtils.scrollAllUpByJS();

        Thread.sleep(4000);

        JSUtils.flash( driver.findElement(By.id("twotabsearchtextbox")));

        Thread.sleep(4000);

    }

        
}
