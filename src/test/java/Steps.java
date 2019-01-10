import components.Home;
import cucumber.api.java.en.Given;

public class Steps {

    @Given("I search for {string} word")
    public void i_search_for_word(String word) {
        new Home().search(word);
    }
}
