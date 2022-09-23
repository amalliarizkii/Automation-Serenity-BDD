package starter.StepDefinitions;

import io.cucumber.java.en.When;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;

public class ContinueShoppingStepDef {

    InventoryPage inventoryPage;
    CartPage cartPage;

    @When("I click button continue shopping")
    public void IClickButtonContinueShopping (){
        cartPage.IClickButtonContinueShopping();
    }
}
