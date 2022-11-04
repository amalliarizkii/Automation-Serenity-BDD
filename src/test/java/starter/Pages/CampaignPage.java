package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CampaignPage extends PageObject {


    @Managed
    WebDriver driver = getDriver();

    private final By TitleCampaign = By.xpath("//main[@id='campaign-page']//h1[.='Satu Mata Dik Rasta Bengkak Menonjol Keluar']");

    private final By ButtonDonasiNow = By.id("campaign-detail_button_donasi-sekarang");

    public String getUrl(){
        return driver.getCurrentUrl();
    }
    public String getTitleCampaign(){
        return driver.findElement(TitleCampaign).getText();
    }

    public void ClickDonasiButton(){
        driver.findElement(ButtonDonasiNow).click();
    }
}
