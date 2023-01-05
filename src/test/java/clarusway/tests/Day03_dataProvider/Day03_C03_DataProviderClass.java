package clarusway.tests.Day03_dataProvider;

import org.testng.annotations.DataProvider;

public class Day03_C03_DataProviderClass {

    @DataProvider(name = "testData")
    public Object[][] data(){

        Object[][] returnData = {
                {"First test", "birinci test"},
                {"Second Test", "ikinci test"},
                {"Third test", "ucuncu test"}
        };

        return returnData;
    }
}
