package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "page-title")
    private WebElement pageTitle;

    @FindBy(css = ".breadcrumb > li")
    private WebElement welcomeMessage;

    @FindBy(css = ".user-area img")
    private WebElement avatar;

    @FindBy(css = ".user-menu a[href=\"/bank/logout\"]")
    private WebElement logoutButton;

    @FindBy(id = "checking-menu")
    private WebElement menuChecking;

    @FindBy(id = "new-checking-menu-item")
    private WebElement newCheckingButton;

    @FindBy(id = "checking-menu")
    private WebElement checkingAccountButton;

    @FindBy(id = "view-checking-menu-item")
    private WebElement viewCheckingAccountButton;

    @FindBy(linkText = "My Profile")
    private WebElement myProfile;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Get page title")
    public String getPageTitle() {
        return pageTitle.getText();
    }

    @Step("Get welcome message")
    public String getWelcomeMessage() {
        return welcomeMessage.getText();
    }

    @Step("Get current url")
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Step("Logout")
    public LoginPage logout() {
        avatar.click();
        logoutButton.click();
        return new LoginPage(driver);
    }

    @Step("Go to new checking")
    public CheckingPage goToNewChecking() {
        menuChecking.click();
        newCheckingButton.click();
        return new CheckingPage(driver);
    }

    @Step("Click view checking account button")
    public ViewCheckingAccountsPage clickViewCheckingAccountButton() {
        checkingAccountButton.click();
        viewCheckingAccountButton.click();
        return new ViewCheckingAccountsPage(driver);
    }

    @Step("Go to My Profile")
    public ProfilePage goTotMyProfile () {
        avatar.click();
        myProfile.click();
        return new ProfilePage(driver);
    }
}
