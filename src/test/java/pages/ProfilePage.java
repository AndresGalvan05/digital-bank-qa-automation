package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "title")
    private WebElement title;

    @FindBy(css = "#title > option:nth-child(1)")
    private WebElement pleaseSelectOption;

    @FindBy(css = "#right-panel > div.content.mt-3 > div > div > div > div > form > div.card-footer > button.btn.btn-primary.btn-sm")
    private WebElement submitButton;

    @Step("Select Title")
    public void selectTitle() {
        title.click();
        pleaseSelectOption.click();
        submitButton.click();
    }


}
