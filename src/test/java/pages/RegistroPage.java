package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistroPage extends BasePage {

    public RegistroPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//header [@class = 'sc-18d3yuz-0 ggQJTs']")
    private WebElement omitir;

    public RestaurantPage clickOmitir() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(omitir)).click();
        return new RestaurantPage(this.getDriver());
    }

}
