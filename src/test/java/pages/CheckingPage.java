package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingPage extends BasePage {

    @FindBy(xpath = "//div[@id='right-panel']/div[2]/div/div/div/div/form/div/div[2]/div[2]/label")
    private WebElement standardCheckingButton;

    @FindBy(xpath= "//div[@id='right-panel']/div[2]/div/div/div/div/form/div/div[3]/div[2]/label")
    private WebElement individualButton;

    @FindBy(id = "name")
    private WebElement accountName;

    @FindBy(id = "openingBalance")
    private WebElement initialDeposit;

    @FindBy(id = "newCheckingReset")
    private WebElement resetButton;


    public CheckingPage(WebDriver driver) {
        super(driver);
    }

    @Step("complete form new checking")
    public void completeFormNewChecking(String nameaccount, String deposit) {
        standardCheckingButton.click();
        individualButton.click();
        accountName.click();
        accountName.clear();
        accountName.sendKeys(nameaccount);
        initialDeposit.click();
        initialDeposit.clear();
        initialDeposit.sendKeys(deposit);
    }

    @Step("reset form")
    public void resetForm() {
        resetButton.click();
    }

    @Step("Get account name")
    public String getAccountName() {
        return accountName.getAttribute("value");
    }

    @Step("Get deposit")
    public String getDeposit() {
        return initialDeposit.getAttribute("value");
    }

}

