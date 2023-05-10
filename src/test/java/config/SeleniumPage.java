package config;

import org.openqa.selenium.WebDriver;

abstract public class SeleniumPage {
    protected static WebDriver webDriver;

    public static void setWebDriver(WebDriver webDriver) {
        SeleniumPage.webDriver = webDriver;
    }
}
