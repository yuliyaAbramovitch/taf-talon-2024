package by.talon.abramovitchyu;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void openLoginPage() {
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        homePage.openLoginPage();
    }

    @Test
    public void testLoginHeaderText() {
        String expectedLoginHeaderText = "Вход в систему";
        Assert.assertEquals(loginPage.getLoginPageHeaderText(), expectedLoginHeaderText);
    }

    @Test
    public void testCurrentURL() {
        String expectedURL = "https://talon.by/login";
        Assert.assertEquals(loginPage.getCurrentURL(), expectedURL);
    }

    @Test
    public void testErrorText() {
        String expectedErrorText = "Неверный e-mail (телефон) или пароль";
        loginPage.inputEmail("test@test.com");
        loginPage.inputPassword("123456");
        loginPage.clickLogin();
        Assert.assertEquals(loginPage.getErrorText(), expectedErrorText);
    }
}
