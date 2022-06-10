package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "(//div [@id = 'infocard'])")
    private WebElement primeraSugerencia;

    @FindBy (xpath = "(//div [@class = 'sc-1uudfj-0 sc-19aiguv-0 xf1tv0-0 xf1tv0-1 PFGNA'])[2]")
    private WebElement segundaSugerencia;

    @FindBy (xpath = "//span [@class = 'teqjqu-0 kTsFWn']")
    private WebElement precioPraSugerencia;

    @FindBy (xpath = "(//span [@class = 'teqjqu-0 kTsFWn'])[2]")
    private WebElement precioSdaSugerencia;

    @FindBy (xpath = "//div [@class = 'sc-1n7rfmd-0 ePubxn']")
    private WebElement direccion;

    public String getDireccion() {
        return this.getWait().until(ExpectedConditions.visibilityOf(direccion)).getText();
    }

    public String getPrecio() {
        return this.getWait().until(ExpectedConditions.visibilityOf(precioPraSugerencia)).getText();
    }

    public AgregarAPedidoPage clickPraSugerencia() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(primeraSugerencia)).click();
        return new AgregarAPedidoPage(this.getDriver());
    }

    public void clickSdaSugerencia() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(segundaSugerencia)).click();
    }
}
