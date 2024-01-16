package tests.searchapartments;

import org.testng.annotations.Test;

public class TestSout {
    @Test(dataProvider = "dataProvaderMethod", dataProviderClass = DataProvaderClass.class)
    public void testSout(String number, String string){
        System.out.println("Test Sout!!! " + number + string);
    }
}
