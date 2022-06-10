package exercises;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

public class Exercise {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.pedidosya.com/");
    }

   /* @AfterMethod
    public void closeDriver() {
        driver.close();
    }*/

    @Test
    public void main () {
        FirstPage primeraPagina = new FirstPage(driver);
        InicioPage inicio = primeraPagina.chooseUruguay();

        String direccion = "Paraguay 2141";
        inicio.setDireccion(direccion);

        ConfirmacionDeUbiPage confirm = inicio.clickBuscar();
        HomePage home = confirm.clickConfirmarUbicacion();

        Assert.assertEquals(direccion, home.getDireccion());

        String precio = home.getPrecio();

        //EL PROBLEMA ESTA AL QUERER OBTENER LOS TEXTOS

        Assert.assertEquals(direccion, home.getDireccion());

        AgregarAPedidoPage agregarPedido = home.clickPraSugerencia();
        RestaurantPage restaurante = agregarPedido.clickAgregarPedido();

        Assert.assertEquals(precio, restaurante.getPrecio());

        System.out.printf(restaurante.getContinuar());

        /*while (restaurante.botonContText.equals("Continuar")) { //lo que dice es dif de continuat, agrego otra cosa}
            agregarPedido = restaurante.clickComida();
            restaurante = agregarPedido.clickAgregarPedido();
        }*/

        RegistroPage registro = restaurante.clickContinuar();
        restaurante = registro.clickOmitir();

    }

}
