package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    @DefaultUrl("https://kitabisa.com//")
    public class HomePage extends PageObject {
        @Managed
        WebDriver driver = getDriver();

        private final By campaignPicture = By.xpath("/html//div[@id='template_horizontal-wide-card-slider']/div[@class='style__TemplateSliderContainer-sc-__sc-7v6i17-0 uQXcF']/div//img[@alt='Satu Mata Dik Rasta Bengkak Menonjol Keluar']");

        public void ClickOneOfTheCampaign(){
                driver.findElement(campaignPicture).click();
        }

        public String getUrlHome() {
            return driver.getCurrentUrl();
        }

    }
