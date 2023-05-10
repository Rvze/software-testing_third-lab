package googleDrive;

import config.SeleniumPage;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends SeleniumPage {
    @FindBy(xpath = "//div[@id='drive_main_page']/div/div[5]/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div")
    private WebElement myDriveButton;
    @FindBy(xpath = "//div[@class=\"a-v-T\"]")
    private WebElement newFolderButton;
    @FindBy(xpath = "//input[@value=\"Untitled folder\"]")
    private WebElement field;
    @FindBy(xpath = "//input[@value=\"Untitled folder\"]")
    private WebElement enter;
    @FindBy(xpath = "//div[@class=\"Q5txwe\" and @data-tooltip=\"test_folder_2\"]")
    private WebElement testFolderButton;
    @FindBy(xpath = "//div[@class=\"h-sb-Ic h-R-d a-vu-w-d a-c-d a-s-Ba-d-Mr-Be-nAm6yf\"]")
    private WebElement toggleButton;
    @FindBy(xpath = "//div[@class=\"a-v-T\" and @aria-label=\"Remove\"]")
    private WebElement removeButton;
    @FindBy(xpath = "//div[@class=\"a-v-T\" and @aria-label=\"Rename\"]")
    private WebElement renameButton;
    @FindBy(xpath = "//input[@class=\"lb-k-Kk g-Gh\"]")
    private WebElement fieldForRename;
    @FindBy(xpath = "//button[@name=\"ok\"]")
    private WebElement okButton;

    public MainPage() {
        webDriver.get("https://drive.google.com/drive/u/0/my-drive");
        PageFactory.initElements(webDriver, this);
    }

    public MainPage createFolder(String folderName) {
        webDriver.manage().window().setSize(new Dimension(1160, 857));
        myDriveButton.click();
        newFolderButton.click();
        field.sendKeys(folderName);
        enter.sendKeys(Keys.ENTER);
        return this;
    }

    public void removeFolder() {
        testFolderButton.click();
        toggleButton.click();
        removeButton.click();
    }

    public void renameFolder(String renamedFolder) {
        testFolderButton.click();
        toggleButton.click();
        renameButton.click();
        fieldForRename.sendKeys(renamedFolder);
        okButton.click();
    }


}
