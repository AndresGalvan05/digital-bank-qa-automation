package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "submit")
    private WebElement loginButton;

    @FindBy(css = ".sufee-alert")
    private WebElement logOutMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Insert username and password")
    public void setUsernameAndPassword(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
    }

    @Step("Click on login button")
    public HomePage clickLoginButton() {
        loginButton.click();
        return new HomePage(driver);
    }

    @Step("Get logout message")
    public String getLogOutMessage() {
        return logOutMessage.getText();
    }
}
