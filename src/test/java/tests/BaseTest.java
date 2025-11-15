package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    protected WebDriver driver;
    //String browser = System.getProperty("browser");

    @BeforeTest
    public void setUp() {
    driver = new ChromeDriver();
    }    
   }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
