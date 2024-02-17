package by.talon.abramovitchyu;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HomePage {
    EdgeDriver driver;

    public HomePage(EdgeDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.findElement(HomePageLocators.loginBtn).click();
    }

    public void openBlogSection() {
        driver.findElement(HomePageLocators.blogSection).click();
    }

    public void inputSearchField(String str) {
        WebElement searchField = driver.findElement(HomePageLocators.searchField);
        searchField.sendKeys(str);
        searchField.sendKeys(Keys.ENTER);
    }

    public String getCopyRightText() {
        String copyRightText = driver.findElement(HomePageLocators.copyRight).getText();
        return copyRightText;
    }
}
