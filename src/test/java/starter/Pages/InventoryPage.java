package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By cartIcon = By.id("shopping_cart_container");

        public String getUrl(){
            return driver.getCurrentUrl();
        }

        public String getHeaderTitle(){
            return driver.findElement(headerTitle).getText();
        }

        public boolean isCartVisible(){
            return driver.findElement(cartIcon).isDisplayed();
        }





//    private final By buttonSorting = By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select");
//
//    public void ClickButtonSorting(){
//        driver.findElement(buttonSorting).click();
//    }
//
//    public void ClickName(){
//        WebElement selectElement = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div[2]/span/select"));
//        Select selectObject = new Select(selectElement);
//        selectObject.selectByVisibleText("Name (Z to A)");
//    }
//

}
