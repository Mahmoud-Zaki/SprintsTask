package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class Header extends BaseClass {
    final private By searchInputField = By.id("search_input");
    final private By searchBtn = By.xpath("//form/button");

    public Header(){
        super();
    }

    public void enterProductNameToSearch(String productName){
        sendKeys(searchInputField,productName);
    }
    public void search(){
        clickOn(searchBtn);
    }

}