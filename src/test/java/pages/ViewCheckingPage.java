package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCheckingPage extends BasePage{
    public ViewCheckingPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "page-title")
    private WebElement pageTitle;

    @Step("Confirm the title coincidence")
    public String pageTitle() {
        return pageTitle.getText();
    }
}

