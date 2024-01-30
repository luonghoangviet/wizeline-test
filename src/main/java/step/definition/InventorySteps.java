package step.definition;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.InventoryPage;

import static org.testng.Assert.assertEquals;


public class InventorySteps extends TestBase{
    InventoryPage inventoryPage = new InventoryPage();

    @Then("^User should be redirected to the inventory page$")
    public void userShouldBeRedirectedToTheInventoryPage() {
        assertEquals(InventoryPage.INVENTORY_PAGE_URL, driver.getCurrentUrl());
    }

}
