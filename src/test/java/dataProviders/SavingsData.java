package dataProviders;

import org.testng.annotations.DataProvider;

public class SavingsData {
    @DataProvider(name = "account")
    public static Object[][] getAccountData() {
        return new Object[][]{
                {"ahorros","5000",}
        };
    }
}