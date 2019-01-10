package components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utils.Actions.*;

public class Home extends BasePage {

    @FindBy(css = "input[title=\"Szukaj\"]")
    private WebElement searchInput;

    public Home() {
        super();
    }

    public void search(String text) {
        sendKeys(searchInput, text);
    }
}
