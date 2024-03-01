package Definitions;

import Pages.Header;
import Pages.SearchPage;

import java.util.List;

public class SearchDefinitions {
    private final Header header = new Header();
    private final SearchPage search = new SearchPage();
    public final String expectedErrorMessage = "No products found matching the search criteria";

    public void search(String productName){
        header.enterProductNameToSearch(productName);
        header.search();
    }

    public Boolean resultIsRelated(){
        List<String> titles = search.getTheTitlesOfSearchResults();
        for(String title: titles){
            if(title.toLowerCase().contains("hp") || title.toLowerCase().contains("dell")
                    || title.toLowerCase().contains("apple") || title.toLowerCase().contains("assus"))
                return true;
        }
        return false;
    }

    public String getActualErrorMessage(){
        return search.getActualErrorMessage();
    }
}