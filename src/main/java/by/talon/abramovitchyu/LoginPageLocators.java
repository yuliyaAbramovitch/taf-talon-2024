package by.talon.abramovitchyu;

import org.openqa.selenium.By;

public class LoginPageLocators {
    static By loginPageHeader = By.cssSelector(".small.top");
    static By emailField = By.cssSelector("input[name='_username']");
    static By passwordField = By.cssSelector("input[name='_password']");
    static By loginBtn = By.cssSelector("input[name='_submit']");
    static By errorText = By.cssSelector(".login li");
}
