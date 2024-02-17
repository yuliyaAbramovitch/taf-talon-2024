package by.talon.abramovitchyu;

import org.openqa.selenium.edge.EdgeDriver;

public class SearchResultsPage {
    EdgeDriver driver;

    public SearchResultsPage(EdgeDriver driver) {
        this.driver = driver;
    }

    public void openResultItem() {
        driver.findElement(SearchResultsPageLocators.resultItem).click();
    }

    public String getItemHeader() {
        String itemHeader = driver.findElement(SearchResultsPageLocators.itemHeader).getText();
        return itemHeader;
    }
}
