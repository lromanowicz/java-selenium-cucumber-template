package utils;

import config.WebDriverSingleton;
import cucumber.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import static config.WebDriverSingleton.getInstance;

public class Actions {

    public static void navigateTo(String url) {
        getInstance().get(System.getProperty("baseUrl") + url);
    }

    public static void click(WebElement element) {
        element.click();
    }

    public static void sendKeys(WebElement element, String text) {
        click(element);
        element.clear();
        element.sendKeys(text);
    }
}
