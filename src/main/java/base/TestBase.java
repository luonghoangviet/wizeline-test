package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestBase {
    protected static WebDriver driver;
    protected static Properties prop;
    private static final String CONFIG_TEST_PROPERTIES = ("config/test.properties");

    public TestBase() {
        try {
            prop = new Properties();
            InputStream inputStream = new FileInputStream(CONFIG_TEST_PROPERTIES);
            prop.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void init() {
        String browserType = prop.getProperty("browser.type");
        switch (browserType.toUpperCase()) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void inputTextToElement(WebElement element, String text) {
        element.clear();
        element.sendKeys(text);
    }
}




