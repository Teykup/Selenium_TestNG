package clarusway.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_C03_DependsOn {


    @Test
    public void loginTest(){
        System.out.println("login test yapılıyor");
    }

    @Test(dependsOnMethods = {"loginTest"})
    public void homePageTest(){
        System.out.println("home page testi yapılıyor");
    }
}
