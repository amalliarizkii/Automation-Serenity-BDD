package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPaymentPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private final By TitleSelect = By.xpath("/html//div[@id='__next']/main/main/div[1]/label");

    private final By BCAButton = By.xpath("/html//div[@id='__next']/main/main/div[4]/div[2]//span[@class='self-center']");

    public void ClickBCAButton(){
        driver.findElement(BCAButton).click();
    }

    public String getUrlSelectPayment() {
        return driver.getCurrentUrl();
    }

    public String getHeaderTitle(){
        return driver.findElement(TitleSelect).getText();
    }


}
