package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class GoogleTest extends BaseTest {
    
    @BeforeMethod
    public void gotoHome() {
        driver.get("https://www.google.com");
    }

    @Test
    public void testValidTitle() {
        assertEquals(driver.getTitle(), "Google");
    }

    @Test
    public void testInvalidTitle() {
        assertNotEquals(driver.getTitle(), "Goo");
    }
}
