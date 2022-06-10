package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AgregarAPedidoPage extends BasePage {

    public AgregarAPedidoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//button [@id = 'product__add__action']")
    private WebElement agregarAMiPedido;

    public RestaurantPage clickAgregarPedido() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(agregarAMiPedido)).click();
        return new RestaurantPage(this.getDriver());
    }
}
