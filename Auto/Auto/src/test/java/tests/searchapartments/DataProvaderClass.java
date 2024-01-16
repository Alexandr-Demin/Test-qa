package tests.searchapartments;

import org.testng.annotations.DataProvider;

public class DataProvaderClass {

    @DataProvider
    public Object[][] dataProvaderMethod(){
        return new Object[][]{
                {"1 ", "string"},
                {"2 ", "string"},
                {"3 ", "string"},
        };
    }
}
