package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstruksiPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By TitleInstruksi = By.xpath("/html//main[@id='summary-page']//span[.='Instruksi Pembayaran']");

    private final By ButtonDonasiLain = By.xpath("/html//main[@id='summary-page']//button[.='Donasi ke penggalangan lain']");

    public String getHeaderTitle(){
        return driver.findElement(TitleInstruksi).getText();
    }

    public String getUrlInstruksi() {
        return driver.getCurrentUrl();
    }

    public void ClickButtonDonasiLain(){
        driver.findElement(ButtonDonasiLain).click();
    }


}
