package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@DefaultUrl("https://www.saucedemo.com/inventory.html")
public class InventoryPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By buttonSorting = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");

    public void ClickButtonSorting(){
        driver.findElement(buttonSorting).click();
    }

    public void ClickName(){
        WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByVisibleText("Name (Z to A)");
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
