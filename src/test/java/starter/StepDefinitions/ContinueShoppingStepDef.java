package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import starter.Pages.CartPage;
import starter.Pages.InventoryPage;

public class ContinueShoppingStepDef {

    InventoryPage inventoryPage;
    CartPage cartPage;

    @And("I click button continue shopping")
    public void IClickButtonContinueShopping (){
        cartPage.IClickButtonContinueShopping();

    }

}
