package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;

public class AddToCartStepDef {

    InventoryPage inventoryPage;

    @When("I select item {string}")
    public void ISelectItem(String item){
        inventoryPage.selectItem(item);
    }

    @Then("item will be added to cart")
    public void ItemWillAdded(){
        assertTrue(inventoryPage.isButtonRemoveVisible());
        assertEquals("1",inventoryPage.getCartPopUp());

    }

    @And("I already added one item to cart")
    public void IAlreadyAdded(){
        inventoryPage.selectItem("add-to-cart-sauce-labs-backpack");
    }

}
