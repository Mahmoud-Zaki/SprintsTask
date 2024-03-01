package Pages;

import Base.BaseClass;
import org.openqa.selenium.By;

public class ProductPage extends BaseClass {
    final private By addToShoppingCartBtn = By.id("button_cart_8976");
    final private By productName = By.xpath("//h1/bdi");

    public ProductPage(){
        super();
    }
    public void addToShoppingCart(){
        clickOn(addToShoppingCartBtn);
    }
    public String getProductName(){
        return getText(productName);
    }
}