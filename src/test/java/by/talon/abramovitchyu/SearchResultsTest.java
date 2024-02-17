package by.talon.abramovitchyu;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTest extends BaseTest {
    HomePage homePage;
    SearchResultsPage searchResultsPage;

    @Test
    public void testItemHeaderText() {
        homePage = new HomePage(driver);
        String expectedItemText = "педиатр";
        homePage.inputSearchField(expectedItemText);
        searchResultsPage = new SearchResultsPage(driver);
        searchResultsPage.openResultItem();
        String actualItemText = searchResultsPage.getItemHeader();
        Assert.assertTrue(actualItemText.toLowerCase().contains(expectedItemText.toLowerCase()));
    }
}
