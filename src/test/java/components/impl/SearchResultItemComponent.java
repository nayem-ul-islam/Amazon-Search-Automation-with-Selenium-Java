package components.impl;

import components.WebComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.entities.SearchResultItem;

public class SearchResultItemComponent extends WebComponent {
    private static final By TITLE_SELECTOR = By.cssSelector("h2 .a-link-normal");


    public SearchResultItemComponent(WebElement rootElement){
        super(rootElement);
    }

    public SearchResultItem convertToSearchResultItem(){
        return new SearchResultItem(
                retrieveTitle(),
                retrieveDescription()
        );
    }
    private String retrieveTitle(){
        return findElement(TITLE_SELECTOR).getText().toLowerCase();
    }
    private String retrieveDescription(){
        return findElement(TITLE_SELECTOR).getAttribute("href").toLowerCase();
    }
}
