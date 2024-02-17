package by.talon.abramovitchyu;

import org.openqa.selenium.By;

public class SearchResultsPageLocators {
    static By resultItem = By.cssSelector(".cell.policlinic .in_active");
    static By itemHeader = By.cssSelector("h1[itemprop=\"name\"]");
}
