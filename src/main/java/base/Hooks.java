package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends TestBase {
    @Before
    public void setUp() {
        init();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
