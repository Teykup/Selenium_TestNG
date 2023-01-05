package clarusway.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day03_C01_DataProvider {


    @Test(dataProvider = "dataProvider")
    public void test01(String name){
        System.out.println(name);
    }


    @DataProvider
    public Object[][] dataProvider(){
        Object[][] data = {
                {"kevser"},
                {"temür"},
                {"hadiOrdan"}
        };
        return data;
    }
}
