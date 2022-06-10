package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ConfirmacionDeUbiPage extends BasePage {

    public ConfirmacionDeUbiPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//button [@id= 'confirm_location_btn']")
    private WebElement confirmarUbicacion;

    public HomePage clickConfirmarUbicacion() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(confirmarUbicacion)).click();
        return new HomePage(this.getDriver());
    }
}
