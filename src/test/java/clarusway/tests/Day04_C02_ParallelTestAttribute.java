package clarusway.tests;

import org.testng.annotations.Test;

public class Day04_C02_ParallelTestAttribute {

    @Test(
            threadPoolSize = 3, // testin kaç çekirdekte paralel olarak çalışacağını belirler.
            invocationCount = 7  // testin kaç defa çalıştırılacağını belirler
    )
    public void test(){
        System.out.println("Current thread Id = " + Thread.currentThread().getId());

    }


}
