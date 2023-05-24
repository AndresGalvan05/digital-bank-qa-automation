package dataProviders;

import org.testng.annotations.DataProvider;

public class LoginData {
    @DataProvider(name = "login")
    public static Object[][] getLoginData() {
        return new Object[][]{
                {"8il.andre@gmail.com", "Pass1234", "Andrés"},
                {"JJohnson@gmail.com", "123Johnson", "Julian"},
        };
    }
}
