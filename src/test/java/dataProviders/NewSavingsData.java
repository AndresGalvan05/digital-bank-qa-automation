package dataProviders;

import org.testng.annotations.DataProvider;

public class NewSavingsData {

    @DataProvider(name = "newSavings")
    public static Object[][] getNewCSavingsData() {
        return new Object[][]{
                {"Ahorros","5000"}
        };
    }
}