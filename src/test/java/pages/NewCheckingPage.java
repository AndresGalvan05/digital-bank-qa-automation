package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCheckingPage extends BasePage {

    public NewCheckingPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "checking-menu")
    private WebElement checkingMenu;

    @FindBy(id = "new-checking-menu-item")
    private WebElement newCheckingMenu;

    @FindBy(id = "page-title")
    private WebElement pageTitle;

    @FindBy(id = "Standard Checking")
    private WebElement standardChecking;

    @FindBy(id = "Individual")
    private WebElement individualAccount;

    @FindBy(id = "name")
    private WebElement accountName;

    @FindBy(id = "openingBalance")
    private WebElement initialDeposit;

    @FindBy(id = "newCheckingSubmit")
    private WebElement submitButton;

    @Step("Click on Checking Menu")
    public void clickCheckingMenu() {
        checkingMenu.click();
    }

    @Step("Click on New Checking ")
    public void clickNewChecking() {
        newCheckingMenu.click();
    }

    @Step("Confirm the title coincidence")
    public String pageTitle() {
        return pageTitle.getText();
    }

    @Step("Click in Standard Checking")
    public void clickStandardChecking() {
        standardChecking.click();
    }

    @Step("Click in Individual Account")
    public void clickIndividualAccount() {
        individualAccount.click();
    }

    @Step("Enter Account Name")    public void accountName(String accountName) {
        this.accountName.sendKeys(accountName);
    }

    @Step("Enter Initial Deposit")
    public void initialDeposit(String initialDeposit) {
        this.initialDeposit.sendKeys(initialDeposit);
    }

    @Step("Click on Submit button")
    public ViewCheckingPage clickSubmitButton() {
        submitButton.click();
        return new ViewCheckingPage(driver);
    }


}