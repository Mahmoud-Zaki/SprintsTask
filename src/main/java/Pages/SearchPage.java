package Pages;
import Base.BaseClass;
import org.openqa.selenium.By;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends BaseClass {

    final private By product = By.xpath("//form/div/div[3]/div[1]/a");
    final private By ActualErrorMessage = By.className("ty-no-items");

    public List<String> getTheTitlesOfSearchResults(){
        List<String> titles = new ArrayList<String>();
        getWebElements(product).forEach((webElement) -> {
            titles.add(webElement.getText());
        });
        return titles;
    }

    public String getActualErrorMessage(){
        return getText(ActualErrorMessage);
    }

    public void goToProductPage(){
        clickOn(product);
    }
}