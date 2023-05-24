package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewSavingsPage extends BasePage {

    public NewSavingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "savings-menu")
    private WebElement savingsMenu;

    @FindBy(id = "new-savings-menu-item")
    private WebElement newSavingsMenu;

    @FindBy(id = "new-savings-menu-item")
    private WebElement newSavings;

    @FindBy(id = "page-title")
    private WebElement pageTitle;

    @FindBy(id = "Savings")
    private WebElement savingsAccountType;

    @FindBy(id = "Individual")
    private WebElement individualAccount;

    @FindBy(id = "name")
    private WebElement accountName;

    @FindBy(id = "openingBalance")
    private WebElement initialDeposit;

    @FindBy(id = "newSavingsSubmit")
    private WebElement savingsSubmitButton;


    //

    @FindBy(id = "Money Market")
    private WebElement moneyMarketRadioButton;

    @FindBy(id = "Joint")
    private WebElement jointRadioButton;

    @FindBy(id = "name")
    private WebElement nameInput;

    @FindBy(id = "openingBalance")
    private WebElement openingBalanceInput;

    @FindBy(id = "newSavingsSubmit")
    private WebElement newSavingsSubmitButton;

    //

    @FindBy(xpath = "//strong[contains(text(),'New Savings Account')]")
    private WebElement newSavingsAccount;

    @Step("Click on Savings Menu")
    public void clickSavingsMenu() {
        savingsMenu.click();
    }

    @Step("Click on New Savings ")
    public void newSavings() {
        newSavings.click();
    }

    @Step("Confirm the title coincidence")
    public String pageTitle() {
        return pageTitle.getText();
    }

    @Step("Click in Savings Account Type")
    public void clickStandardSavings() {
        savingsAccountType.click();
    }

    @Step("Click in Individual Account")
    public void clickIndividualAccount() {
        individualAccount.click();
    }

    @Step("Enter Account Name")
    public void accountName(String accountName) {
        this.accountName.sendKeys(accountName);
    }

    @Step("Enter Initial Deposit")
    public void initialDeposit(String initialDeposit) {
        this.initialDeposit.sendKeys(initialDeposit);
    }

    @Step("Click on Submit button")
    public ViewSavingsPage clickSubmitButton() {
        savingsSubmitButton.click();
        return new ViewSavingsPage(driver);
    }


    //


    @Step("Click on savings button")
    public void saving() {
        savingsMenu.click();
    }
    @Step("Click on savings menu")
    public void savingMenu() {
        newSavingsMenu.click();
    }
    @Step("Check the page title assert")
    public String getPageTitle() {
        return newSavingsAccount.getText();
    }
    @Step("Click on individual radio button ")
    public void moneyMarketRadioBtn() {
        moneyMarketRadioButton.click();
    }
    @Step("Click on individual radio button ")
    public void jointRadioBtn() {
        jointRadioButton.click();
    }
    @Step("Enter name and value input fields")
    public void enterNameValueInput(String name, String value) {
        nameInput.clear();
        nameInput.sendKeys(name);
        openingBalanceInput.clear();
        openingBalanceInput.sendKeys(value);
    }

    @Step("Press 'Submit' to submit data")
    public ViewSavingsAccountPage clickNewSavingsSubmitButton() {
        newSavingsSubmitButton.click();
        return new ViewSavingsAccountPage(driver);

    }

    //
}