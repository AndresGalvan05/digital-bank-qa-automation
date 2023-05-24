package scripts;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.CheckingPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Constants;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class NewCheckingResetButtonTest {
    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(Constants.urlBase);
    }


    @Test (dataProvider = "newChecking", dataProviderClass = dataProviders.NewCheckingData.class)
    public void newCheckingResetButton(String nameAccount, String deposit) {
        String inputVacio = "";

        LoginPage loginPage = new LoginPage(driver);
        loginPage.setUsernameAndPassword(Constants.userAndres, Constants.passwordAndres);
        HomePage homePage = loginPage.clickLoginButton();
        CheckingPage checkingPage = homePage.goToNewChecking();
        checkingPage.completeFormNewChecking(nameAccount, deposit);
        assertEquals(checkingPage.getAccountName(),nameAccount);
        assertEquals(checkingPage.getDeposit(), deposit);

        takeScreenshot();

        checkingPage.resetForm();
        assertEquals(checkingPage.getAccountName(), inputVacio);
        assertEquals(checkingPage.getDeposit(), inputVacio);

        takeScreenshot();

        homePage.logout();

    }


    @AfterTest
    public void tearDown() {
        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("Exception while closing the driver " + e.getMessage());
        }
    }

    @Attachment(type = "image/png")
    @AfterMethod(alwaysRun = true)
    public byte[] takeScreenshot() {
        byte[] image = new byte[0];
        try {
            TakesScreenshot screenshot = (TakesScreenshot) driver;
            image = screenshot.getScreenshotAs(OutputType.BYTES);
            System.out.println("Successfully captured a screenshot");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot " + e.getMessage());
        }
        return image;
    }
}