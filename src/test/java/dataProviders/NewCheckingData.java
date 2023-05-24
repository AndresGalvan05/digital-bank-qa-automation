package dataProviders;

import org.testng.annotations.DataProvider;

public class NewCheckingData {
        @DataProvider(name = "newChecking")
        public static Object[][] getNewCheckingData() {
            return new Object[][]{
                    {"Prueba", "40000"},
            };
        }
    }
