package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class SavingsPage extends BasePage {
    public SavingsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "savings-menu")
    private WebElement savingsMenu;

    @FindBy(id = "view-savings-menu-item")
    private WebElement viewSavingsMenu;
    @FindBy(id = "page-title")
    private WebElement pageTitle;
    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchInput;
    @FindBy(css = "#transactionTable > tbody > tr > td:nth-child(3)")
    private WebElement dividend;

    @Step("Click on menu Savings")
    public void clickOnSavingsMenu() {
        savingsMenu.click();
    }
    @Step("Click to select view Savings")
    public void clickOnViewSavingsMenu() {
        viewSavingsMenu.click();
    }
    @Step("Verify to match title with the title expected")
    public String getPageTitleText() {
        return pageTitle.getText();
    }
    @Step("Entry new data to input form")
    public void enterSearchValue(String searchValue) {
        searchInput.sendKeys(searchValue);
    }
    @Step("Submit input")
    public void submit() {
        searchInput.click();
    }

    @Step("Verify to match text search with the searched text")
    public String getDividendText() {
        return dividend.getText();
    }
}
