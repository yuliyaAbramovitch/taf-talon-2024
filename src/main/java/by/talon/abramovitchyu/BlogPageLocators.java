package by.talon.abramovitchyu;

import org.openqa.selenium.By;

public class BlogPageLocators {
    static By nutritionTopic = By.cssSelector(".tui-header-bar a[href='/section/nutrition/articles']");
    static By resultItem = By.cssSelector(".article-overview");
    static By itemTag = By.cssSelector(".article-header-details a[href='/section/nutrition/articles'].article-section");
}
