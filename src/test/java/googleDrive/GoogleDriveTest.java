package googleDrive;

import config.SeleniumTest;
import org.junit.jupiter.api.Test;

public class GoogleDriveTest extends SeleniumTest {

    @Test
    public void createFolder() {
        String folderName = "folder#1";
        MainPage mainPage = new MainPage();
        mainPage.createFolder(folderName);
    }
}
