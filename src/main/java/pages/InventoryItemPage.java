package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryItemPage extends TestBase {

    @FindBy(xpath = "//button[contains(text(),'Add to cart')]")
    public WebElement btnAddToCart;

    @FindBy(xpath = "//div[contains(@class,'inventory_details_name')]")
    public WebElement title;

    public InventoryItemPage() {
        PageFactory.initElements(driver, this);
    }

    public String getItemName()
    {
        return title.getText();
    }
}
