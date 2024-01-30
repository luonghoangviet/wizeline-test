package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage extends TestBase {

    @FindBy(className = "inventory_list")
    public WebElement listInventory;
    public static final String INVENTORY_PAGE_URL = ("https://www.saucedemo.com/inventory.html");
    public static final String INVENTORY_ITEM_PAGE_URL = ("https://www.saucedemo.com/inventory-item.html");

    private final static String XPATH_ITEM_BY_TITLE = "//div[contains(text(),'%s')] //parent::a";


    public InventoryPage() {
        PageFactory.initElements(driver, this);
    }

    public void selectItemContainName(String title) {
        listInventory.findElement(By.xpath(String.format(XPATH_ITEM_BY_TITLE, title))).click();
        System.out.println("ahihi");
    }
}
