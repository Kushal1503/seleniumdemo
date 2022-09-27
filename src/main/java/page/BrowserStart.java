package page;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class BrowserStart {
    WebDriver driver;

    public BrowserStart(WebDriver driver) {
        this.driver = driver;

    }

    public void startBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Panchal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }

    public void navigateToURL() {
        driver.navigate().to("https://www.youtube.com/watch?v=dbzc9UbFZt8");
    }


    public void closeBrowser() {
        driver.close();
    }

    public void takeScreenShot(String fileName) throws IOException {
        //Step 1 : TypeCase TakeScreenshot to Driver Take Screenshot and
        TakesScreenshot srcSht = ((TakesScreenshot) driver);

        //Source File and store the file
        File srcFile = srcSht.getScreenshotAs(OutputType.FILE);
        //Location of file where you want to store
        File destFile = new File("C:\\Users\\Priyanka Panchal\\IdeaProjects\\AutomationWithMaven\\src\\main\\java\\flow", fileName+".png");
        //Step 2 : Copy the screenshot to desired location using copyFile Method
        FileUtils.copyFile(srcFile, destFile);

    }
}
