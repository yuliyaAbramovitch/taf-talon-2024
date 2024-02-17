package by.talon.abramovitchyu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {
    HomePage homePage = new HomePage(driver);

    @Test
    public void testCopyRightTest() {
        Assert.assertEquals(homePage.getCopyRightText(), "© ЗАО «Мапсофт», 2010-2024\n" +
                "Все права защищены");
    }
}
