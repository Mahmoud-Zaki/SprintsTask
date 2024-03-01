package Steps;
import Definitions.HomeDefinitions;
import io.cucumber.java.en.Given;

public class HomeSteps {
    private final HomeDefinitions definitions = new HomeDefinitions();

    @Given("Go to home page")
    public void goToHomePage() {
        definitions.goToHomePage();
    }
}