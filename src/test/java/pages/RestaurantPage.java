package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RestaurantPage extends BasePage {

    public RestaurantPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//button [@id= 'cart__continue__action']")
    private WebElement continuar;

    @FindBy (xpath = "//span [@class = 'teqjqu-0 kTsFWn']")
    private WebElement precio;

    @FindBy (xpath = "//div [@id = 'infocard']")
    private WebElement primeraComida;


    public String getPrecio() {
        return this.getWait().until(ExpectedConditions.visibilityOf(precio)).getText();
    }

    public String getContinuar() {
        return this.getWait().until(ExpectedConditions.visibilityOf(continuar)).getText();
    }


    public RegistroPage clickContinuar() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(continuar)).click();
        return new RegistroPage(this.getDriver());
    }

    public AgregarAPedidoPage clickComida() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(primeraComida)).click();
        return new AgregarAPedidoPage(this.getDriver());
    }
}
