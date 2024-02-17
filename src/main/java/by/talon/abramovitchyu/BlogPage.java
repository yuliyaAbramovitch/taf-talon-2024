package by.talon.abramovitchyu;

import org.openqa.selenium.edge.EdgeDriver;

public class BlogPage {
    EdgeDriver driver;

    public BlogPage(EdgeDriver driver) {
        this.driver = driver;
    }

    public void openNutritionTopicPage() {
        driver.findElement(BlogPageLocators.nutritionTopic).click();
    }

    public void openResultItem() {
        driver.findElement(BlogPageLocators.resultItem).click();
    }

    public String getItemTag() {
        String itemTag = driver.findElement(BlogPageLocators.itemTag).getText();
        return itemTag;
    }
}
