package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DonasiPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By TitleDonasi = By.xpath("//main[@id='donation-amount']/p[.='Masukkan Nominal Donasi']");

    private final By NominalDonasi = By.id("contribute_inputfield_amount-donation");

    private final By ButtonLanjutPembayaran = By.id("contribute_button_lanjutkan-pembayaran");

    public String getUrlDonasi(){
        return driver.getCurrentUrl();
    }
    public String getTitleDonasi(){
        return driver.findElement(TitleDonasi).getText();
    }

    public void InputNominal(int jumlah){
        driver.findElement(NominalDonasi).sendKeys("jumlah");
    }

    public void ClickButtonLanjutBayar(){
        driver.findElement(ButtonLanjutPembayaran).click();
    }
}
