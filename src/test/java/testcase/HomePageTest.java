package testcase;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.BrowserStart;
import page.BrowserStart.*;

import java.io.IOException;

public class HomePageTest {
    WebDriver driver;

    BrowserStart browserStart = new BrowserStart(driver);

   @BeforeClass
    public void setBrowser() {
        System.out.println("I am before Class");
        //Remove if using UI
         browserStart.startBrowser();
    }

    @Test
    public void runHomePage() throws IOException {

        browserStart.navigateToURL();
        browserStart.takeScreenShot("ScreenShotName 2" );
    }

    @AfterTest
    public void closeChrome() {
        System.out.println("I am after test");
        browserStart.closeBrowser();
    }

    @Test
    public void f() {
        //Assertion pass scenario
        Assert.assertTrue(2 + 2 == 4);
        System.out.println("Scenario 1 passed");
        //Assertion fail scenario
        Assert.fail("Scenario 2 failed with Assert");
        System.out.println("Scenario 2 failed");
    }

}
