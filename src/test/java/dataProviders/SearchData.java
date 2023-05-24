package dataProviders;

import org.testng.annotations.DataProvider;

public class SearchData {
    @DataProvider(name = "search")
    public static Object[][] getSearchData() {
        return new Object[][]{
                {"View Savings Accounts", "Deposit", "845335722 (DPT) - Deposit"},
        };
    }
}
