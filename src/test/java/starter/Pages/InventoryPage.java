package starter.Pages;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class InventoryPage extends PageObject {

    @Managed
    WebDriver driver = getDriver();

    private final By headerTitle = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
    private final By cartIcon = By.id("shopping_cart_container");
    private final By buttonRemove = By.id("remove-sauce-labs-backpack");
    private final By cartPopUp = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    private final By sortingDropDown = By.className("product_sort_container");
    private final By sortActive = By.className("active_option");
    private final By iconCart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");


        public String getUrl(){
            return driver.getCurrentUrl();
        }

        public String getHeaderTitle(){
            return driver.findElement(headerTitle).getText();
        }

        public boolean isCartVisible(){
            return driver.findElement(cartIcon).isDisplayed();
        }

        public void selectItem(String item){
            driver.findElement(By.id(item)).click();
        }

        public boolean isButtonRemoveVisible(){
            return driver.findElement(buttonRemove).isDisplayed();
        }

        public String getCartPopUp(){
            return driver.findElement(cartPopUp).getText();
        }


        public void selectSortBy(String sortBy){
            Select dropDown = new Select(driver.findElement(sortingDropDown));
            dropDown.selectByVisibleText(sortBy);
        }

        public String getActiveSort(){
            return driver.findElement(sortActive).getText();
        }

        public void selectProduct(String product){
        driver.findElement(By.id(product)).click();
        }

        public void IClickShoppingCart(){
            driver.findElement(iconCart).click();
        }



}
