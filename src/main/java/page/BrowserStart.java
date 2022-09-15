package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserStart {
    WebDriver driver;

    public BrowserStart(WebDriver driver) {
        this.driver = driver;

    }

    public void startBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Priyanka Panchal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

    }
    public void navigateToURL(){
        driver.navigate().to("https://www.youtube.com/watch?v=dbzc9UbFZt8");
    }


    public void closeBrowser() {
        driver.close();
    }
}
