package googleDrive;

import config.SeleniumTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

class NewFolderTest extends SeleniumTest {
    @Test
    void createFolderTest() {
        MainPage mainPage = new MainPage();
        mainPage.createFolder("test_folder_2");
        List<WebElement> elements = webDriver.findElements(By.xpath("//div[@class=\"Q5txwe\" and .=\"test_folder_2\"]"));
        assert (elements.size() > 0);
    }

    @Test
    void removeFolderTest() {
        MainPage mainPage = new MainPage();
        mainPage.removeFolder();
        List<WebElement> elements = webDriver.findElements(By.xpath("//div[@class=\"Q5txwe\" and @data-tooltip=\"test_folder_2\"]"));
        assert (elements.size() == 0);
    }

    @Test
    void renameFolderTest() {
        MainPage mainPage = new MainPage();
        mainPage.renameFolder("renamed_folder_2");
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\"Q5txwe\" and @data-tooltip=\"renamed_folder_2\"]")));
        List<WebElement> elements = webDriver.findElements(By.xpath("//div[@class=\"Q5txwe\" and @data-tooltip=\"renamed_folder_2\"]"));
        assert (elements.size() > 0);
    }
}

