package by.talon.abramovitchyu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
    EdgeDriver driver;

    public LoginPage(EdgeDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageHeaderText() {
        String loginHeaderText = driver.findElement(LoginPageLocators.loginPageHeader).getText();
        return loginHeaderText;
    }

    public String getCurrentURL() {
        String currentURL = driver.getCurrentUrl().toString();
        return currentURL;
    }

    public void inputEmail(String str) {
        WebElement emailField = driver.findElement(LoginPageLocators.emailField);
        emailField.sendKeys(str);
    }

    public void inputPassword(String str) {
        WebElement passwordField = driver.findElement(LoginPageLocators.passwordField);
        passwordField.sendKeys(str);
    }

    public void clickLogin() {
        driver.findElement(LoginPageLocators.loginBtn).click();
    }

    public String getErrorText() {
        String errorText = driver.findElement(LoginPageLocators.errorText).getText();
        return errorText;
    }
}
