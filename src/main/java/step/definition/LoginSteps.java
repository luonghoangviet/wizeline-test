package step.definition;

import base.TestBase;
import io.cucumber.java.en.Given;
import pages.LoginPage;


public class LoginSteps extends TestBase{
    LoginPage loginPage = new LoginPage();
    @Given("^I login to saucedemo page$")
    public void loginToPage(){
        driver.get(prop.getProperty("base.url"));
        loginPage.login();
    }


}
