package starter.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;

import static org.junit.Assert.*;

public class SortingStepDef {

    InventoryPage inventoryPage;

    @Given("I have logged in and added one product to the cart")
    public void LoggedInAndAddedOneProduct(){
        inventoryPage.open();

    }
    @When("I click button sorting")
    public void ClickButtonSorting(){
        inventoryPage.ClickButtonSorting();

    }
    @And("I select Name Z to A")
    public void ClickName(){
        inventoryPage.ClickName();

    }
    @Then("page inventory showed the product name from Z to A")
    public void PageInventoryShowedProductName(){
        assertEquals("https://www.saucedemo.com/inventory.html",inventoryPage.getUrl());
    }
}
