package starter.StepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Pages.InventoryPage;
import static org.junit.Assert.*;

public class SortingStepDef {

    InventoryPage inventoryPage;

    @When("I click sort by {string}")
    public void i_click_sort_by (String sortBy){

        inventoryPage.selectSortBy(sortBy);

    }
    @Then("the product will be sorting by {string}")
    public void the_product_will_be_sorting_by (String sortBy){

        assertEquals("NAME (Z TO A)",inventoryPage.getActiveSort());
    }
}
