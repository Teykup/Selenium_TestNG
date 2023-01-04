package clarusway.tests.HW;


import clarusway.utilities.BaseCrossBrowserTest;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class Task1_DataProvider extends BaseCrossBrowserTest {
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
    public Object [][] data() throws IOException {

        String path = "C:\\Users\\User\\OneDrive\\Masaüstü\\Yeni Microsoft Office Excel Çalışma Sayfası.xlsx";
        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);

        Row row1 = sheet.getRow(1);
        Row row2 = sheet.getRow(2);
        Row row3 = sheet.getRow(3);


        return new Object [][] {
                {row1.getCell(0).toString(), row1.getCell(1).toString()},
                {row2.getCell(0).toString(), row2.getCell(1).toString()},
                {row3.getCell(0).toString(), row3.getCell(1).toString()}
        };
    }
}
