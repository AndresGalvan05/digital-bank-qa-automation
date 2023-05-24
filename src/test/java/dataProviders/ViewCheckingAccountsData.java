package dataProviders;

import org.testng.annotations.DataProvider;

public class ViewCheckingAccountsData {
    @DataProvider(name = "viewCheckingAccounts")
    public static Object[][] getCheckingAccounts() {
        return new Object[][]{
                {"1", "2023-05-22 17:21", "Income", "845334860 (DPT) - Deposit", "$500.00", "$500.00"},
                {"2", "2023-05-22 17:22", "Income", "845334864 (DPT) - Deposit", "$7500.00", "$7500.00"},
        };
    }
}