package by.talon.abramovitchyu;

import org.openqa.selenium.By;

public class HomePageLocators {
    static By copyRight = By.cssSelector(".copyright-text");
    static By loginBtn = By.cssSelector("[href='/login']");
    static By blogSection = By.cssSelector("#headerMenu [href='https://blog.talon.by/']");
    static By searchField = By.cssSelector("input[name='search']");
}
