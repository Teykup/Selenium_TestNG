package clarusway.tests;

import clarusway.utilities.BaseTestReport;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day05_C01_HTMLReport extends BaseTestReport {

    @Test
    public void test01(){
        extentTest = extentReports.createTest("test01");
        driver.get("https://www.google.com/");
        Assert.fail();
    }

    @Test
    public void test02(){
        extentTest = extentReports.createTest("test02");
        driver.get("https://www.google.com/");

    }
}
