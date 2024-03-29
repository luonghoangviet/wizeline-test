package step.definition;

import base.TestBase;
import io.cucumber.java.en.Then;
import pages.InventoryItemPage;

import static org.testng.Assert.assertTrue;


public class InventoryItemSteps extends TestBase {
    InventoryItemPage inventoryItemPage = new InventoryItemPage();


    @Then("^I should see item contains \"([^\"]*)\" in title$")
    public void verifyItemByTitle(String title) {
        assertTrue(inventoryItemPage.getItemName().contains(title));
    }

    @Then("^I click add to cart button on the item page$")
    public void clickAddToCart() {
        inventoryItemPage.addToCart();
        System.out.println("ahih");
    }
}


