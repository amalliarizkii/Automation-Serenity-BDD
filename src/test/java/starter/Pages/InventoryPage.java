package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private By buttonSorting = By.xpath("/html/body/div/div/div/div[1]/div[2]/div[2]/span/select");

    public void ClickButtonSorting(){
        driver.findElement(buttonSorting).click();

    }

    public static String getUrl(){
        return driver.getCurrentUrl();
    }



}
