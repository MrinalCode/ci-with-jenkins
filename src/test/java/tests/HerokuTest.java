package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class HerokuTest extends BaseTest {

    @BeforeMethod
    public void gotoHome() {
        driver.get("https://the-internet.herokuapp.com");
    }

    @Test
    public void testValidTitle() {
        assertEquals(driver.getTitle(), "The Internet");
    }

    @Test
    public void testInvalidTitle() {
        assertNotEquals(driver.getTitle(), "The");
    }
}
