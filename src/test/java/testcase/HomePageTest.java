package testcase;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.BrowserStart;

public class HomePageTest {
    WebDriver driver;

    BrowserStart browserStart = new BrowserStart(driver);

    @BeforeClass
    public void setBrowser() {
        System.out.println("I am before Class");
        browserStart.startBrowser();
    }

    @Test
    public void runHomePage() {

        browserStart.navigateToURL();
    }

    @AfterTest
    public void closeChrome() {
        System.out.println("I am after test");
        browserStart.closeBrowser();
    }


}
