package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

public class ShoppingCartPage extends BaseClass {
    private final By productName = By.xpath("//*[@id=\"cart_items\"]/table/tbody/tr/td[2]/a[1]");

    public ShoppingCartPage(){
        super();
    }
    public String getFirstProductName(){
        return getText(productName);
    }
}