package step.definition;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InventoryPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class InventorySteps extends TestBase{
    InventoryPage inventoryPage = new InventoryPage();

    @Then("^I should be redirected to the inventory page$")
    public void userShouldBeRedirectedToTheInventoryPage() {
        assertEquals(InventoryPage.INVENTORY_PAGE_URL, driver.getCurrentUrl());
    }

    @Then("^I should be redirected to the item page$")
    public void userShouldBeRedirectedToTheInventoryItemPage() {
        assertTrue(driver.getCurrentUrl().contains(InventoryPage.INVENTORY_ITEM_PAGE_URL));
    }

    @When("^I select item contains \"([^\"]*)\" title$")
    public void selectItemByTitle(String title)  {
        inventoryPage.selectItemContainName(title);
    }

}
