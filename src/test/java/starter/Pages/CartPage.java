package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By buttonContinue = By.id("continue-shopping");

    public String getUrl(){
        return driver.getCurrentUrl();
    }

    public void removeProduct(String product){
        driver.findElement(By.id(product)).click();
    }

    public void IClickButtonContinueShopping(){
        driver.findElement(buttonContinue).click();
    }
}
