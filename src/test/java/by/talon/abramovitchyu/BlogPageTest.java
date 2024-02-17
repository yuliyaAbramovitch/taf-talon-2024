package by.talon.abramovitchyu;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlogPageTest extends BaseTest {
    HomePage homePage = new HomePage(driver);
    BlogPage blogPage = new BlogPage(driver);

    @BeforeMethod
    public void openBlogSection() {
        homePage.openBlogSection();
    }

    @Test
    public void testItemHeaderText() {
        blogPage.openNutritionTopicPage();
        blogPage.openResultItem();
        String expectedItemText = "ПИТАНИЕ";
        Assert.assertEquals(blogPage.getItemTag().toUpperCase(), expectedItemText);
    }
}
