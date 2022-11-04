package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By ButtonPilih = By.id("contribute_button_pilih-metode-pembayaran");

    private final By fieldName = By.id("fullname");

    private final By fieldPhoneNumber = By.id("username");

    private final By ButtonPayment = By.id("contribute_button_lanjutkan-pembayaran");

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    public void ClickButtonPilih(){
        driver.findElement(ButtonPilih).click();
    }

    public void InputName(String name) {
        driver.findElement(fieldName).sendKeys(name);
    }

    public void InputPhoneNumber(int phone){
        driver.findElement(fieldPhoneNumber).sendKeys("phone");
    }

    public void ClickPayment(){
        driver.findElement(ButtonPayment).click();
    }


}
