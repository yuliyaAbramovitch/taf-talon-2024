package by.talon.abramovitchyu;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    EdgeDriver driver;

    @BeforeMethod
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://talon.by/");
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
