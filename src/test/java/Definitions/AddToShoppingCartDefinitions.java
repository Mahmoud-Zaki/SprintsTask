package Definitions;

import Pages.Header;
import Pages.ProductPage;
import Pages.SearchPage;
import Pages.ShoppingCartPage;
import Utilies.HelperClass;

import java.util.List;

public class AddToShoppingCartDefinitions {
    private final Header header = new Header();
    private final SearchPage search = new SearchPage();
    private final ProductPage product = new ProductPage();
    private final ShoppingCartPage shoppingCart = new ShoppingCartPage();
    public String expectedProductName = "";

    public void goToProductPage(){
        search.goToProductPage();
    }

    public void addTheProductToShoppingCartFromTheProductPage() {
        expectedProductName = product.getProductName();
        product.addToShoppingCart();
    }

    public void goToShoppingCart(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        HelperClass.navigateTo("https://egyptlaptop.com/cart");
    }

    public String getActualProductNameFromCart(){
        return shoppingCart.getFirstProductName();
    }
}