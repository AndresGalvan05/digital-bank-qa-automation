package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingAccountsPage extends BasePage {
    @FindBy(id = "page-title")
    private WebElement pageTitle;

    private String lastTransactionDate;
    private String lastTransactionCategory;
    private String lastTransactionDescription;
    private String lastTransactionAmount;
    private String lastTransactionBalance;

    public ViewCheckingAccountsPage(WebDriver driver) {
        super(driver);
    }

    @Step("Get page title")
    public String getPageTitle() {
        return pageTitle.getText();
    }

    @Step("Click toggle button")
    public void clickToggleButton(String accountGridNumber) {
        WebElement toggleButton = driver.findElement(By.cssSelector("#firstRow > div:nth-child(" + accountGridNumber + ") > div > form > div > label > span.switch-label"));
        toggleButton.click();
    }

    @Step("Set last transaction data")
    public void setLastTransactionData() {
        WebElement lastTransactionDateElement = driver.findElement(By.cssSelector("#transactionTable > tbody > tr:nth-child(1) > td:nth-child(1)"));
        WebElement lastTransactionCategoryElement = driver.findElement(By.cssSelector("#transactionTable > tbody > tr:nth-child(1) > td:nth-child(2)"));
        WebElement lastTransactionDescriptionElement = driver.findElement(By.cssSelector("#transactionTable > tbody > tr:nth-child(1) > td:nth-child(3)"));
        WebElement lastTransactionAmountElement = driver.findElement(By.cssSelector("#transactionTable > tbody > tr:nth-child(1) > td:nth-child(4)"));
        WebElement lastTransactionBalanceElement = driver.findElement(By.cssSelector("#transactionTable > tbody > tr:nth-child(1) > td:nth-child(5)"));

        lastTransactionDate = lastTransactionDateElement.getText();
        lastTransactionCategory = lastTransactionCategoryElement.getText();
        lastTransactionDescription = lastTransactionDescriptionElement.getText();
        lastTransactionAmount = lastTransactionAmountElement.getText();
        lastTransactionBalance = lastTransactionBalanceElement.getText();
    }

    @Step("Get last transaction date")
    public String getLastTransactionDate() {
        return lastTransactionDate;
    }

    @Step("Get last transaction category")
    public String getLastTransactionCategory() {
        return lastTransactionCategory;
    }

    @Step("Get last transaction description")
    public String getLastTransactionDescription() {
        return lastTransactionDescription;
    }

    @Step("Get last transaction amount")
    public String getLastTransactionAmount() {
        return lastTransactionAmount;
    }

    @Step("Get last transaction balance")
    public String getLastTransactionBalance() {
        return lastTransactionBalance;
    }
}