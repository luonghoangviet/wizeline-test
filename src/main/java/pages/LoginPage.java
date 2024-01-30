package pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends TestBase {
    @FindBy(id = "user-name")
    WebElement txtUserId;

    @FindBy(id = "password")
    WebElement txtPassword;

    @FindBy(id = "login-button")
    WebElement btnLogin;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login() {
        inputTextToElement(this.txtUserId, prop.get("user.id").toString());
        inputTextToElement(this.txtPassword, prop.getProperty("user.password").toString());
        btnLogin.click();
    }
    public void login(String username, String password) {
        inputTextToElement(this.txtUserId, username);
        inputTextToElement(this.txtPassword, password);
        btnLogin.click();
    }
}
