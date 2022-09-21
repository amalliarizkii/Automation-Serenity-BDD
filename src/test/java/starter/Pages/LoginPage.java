package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject{
    @Managed
    WebDriver driver = getDriver();

    private By fieldUsername = By.id("user-name");
    private By fieldPassword = By.id("password");
    private By buttonLogin = By.id("login-button");

    public void InputUsername(String username){
        driver.findElement(fieldUsername).sendKeys(username);

    }

    public void InputPassword(String password){
        driver.findElement(fieldPassword).sendKeys(password);

    }

    public void ClickButtonLogin(){

        driver.findElement(buttonLogin).click();
    }

    public String getUrl(){

        return driver.getCurrentUrl();
    }


}