package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InicioPage extends BasePage {

    public InicioPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//input [@id= 'search_address_input']")
    private WebElement direccion;

    @FindBy (xpath = "//button [@id = 'location_search_btn']")
    private WebElement buscar;

    public void setDireccion(String direccion) {
        this.direccion.sendKeys(direccion);
    }

    public String getDireccion() {
        return this.direccion.getText();
    }

    public ConfirmacionDeUbiPage clickBuscar() {
        this.getWait().until(ExpectedConditions.elementToBeClickable(buscar)).click();
        return new ConfirmacionDeUbiPage(this.getDriver());
    }
}
