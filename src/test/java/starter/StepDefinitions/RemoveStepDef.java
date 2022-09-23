package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;

public class RemoveStepDef {

    InventoryPage inventoryPage;
    CartPage cartPage;

    @When("I select product {string}")
    public void ISelectProduct(String product){
        inventoryPage.selectProduct(product);
    }

   @And("I click shopping cart")
    public void IClickShoppingCart(){

        inventoryPage.IClickShoppingCart();
   }

   @Then("I redirected to cart page")
   public void IRedirectedToCartPage(){
       assertEquals("https://www.saucedemo.com/cart.html",cartPage.getUrl());
   }

   @And("I remove product {string}")
    public void IRemoveProduct(String product){
        cartPage.removeProduct(product);
   }

//   @Then("the product will deleted")
//    public void TheProductWillDeleted(){
//
//   }



}
