package Steps;

import Definitions.SearchDefinitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SearchSteps {
    private final SearchDefinitions definitions = new SearchDefinitions();

    @When("Enter product name as {string}")
    public void enterProductNameAs(String productName) {
        definitions.search(productName);
    }

    @Then("Verify that the results related to the product name is displayed")
    public void verifyThatTheResultsRelatedToTheProductNameIsDisplayed() {
        Assert.assertTrue(definitions.resultIsRelated());
    }

    @Then("Verify that the error message is displayed")
    public void verifyThatTheErrorMessageIsDisplayed() {
        Assert.assertEquals(definitions.getActualErrorMessage(),definitions.expectedErrorMessage);
    }
}