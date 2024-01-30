package pages;

import base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends TestBase {
    public static final String INVENTORY_PAGE_URL = ("https://www.saucedemo.com/inventory.html");

    public InventoryPage(){
        PageFactory.initElements(driver,this);
    }
}
