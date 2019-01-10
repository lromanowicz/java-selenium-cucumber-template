package support;

import config.WebDriverSingleton;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

import static utils.Actions.navigateTo;

public class Hooks {

    @Before
    public void openHome() {
        WebDriverSingleton.getInstance().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverSingleton.getInstance().manage().window().maximize();
        navigateTo("");
    }

    @After
    public void quit(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) WebDriverSingleton.getInstance()).getScreenshotAs(OutputType.BYTES), "image/png");
        }
        WebDriverSingleton.quit();
    }
}
