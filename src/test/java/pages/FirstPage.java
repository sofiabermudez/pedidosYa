package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FirstPage extends BasePage {

    public FirstPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "(//a [@class = 'sc-1c4res8-1 dXbkqb'])[14]")
    private WebElement uruguay;

    public InicioPage chooseUruguay() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(uruguay)).click();
        return new InicioPage(this.getDriver());
    }
}
