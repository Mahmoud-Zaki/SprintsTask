package Steps;
import Definitions.AddToShoppingCartDefinitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AddToShoppingCartSteps {
    private final AddToShoppingCartDefinitions definitions = new AddToShoppingCartDefinitions();

    @And("Go to product page")
    public void goToProductPage() {
        definitions.goToProductPage();
    }

    @When("Add the product to shopping cart from the product page")
    public void addTheProductToShoppingCartFromTheProductPage() {
        definitions.addTheProductToShoppingCartFromTheProductPage();
    }

    @And("Go to shopping cart")
    public void goToShoppingCart() {
        definitions.goToShoppingCart();
    }

    @Then("Verify that product added in the shopping cart")
    public void verifyThatProductAddedInTheShoppingCart() {
        Assert.assertEquals(definitions.getActualProductNameFromCart(),definitions.expectedProductName);
    }
}
