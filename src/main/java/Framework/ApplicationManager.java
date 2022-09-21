package Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    String browser;
    WebDriver driver;

    SearchHelper search;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public SearchHelper getSearch() {
        return search;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            driver = new ChromeDriver();
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new FirefoxDriver();
        }
        driver = new ChromeDriver();
        driver.get("https://ya.ru");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        search = new SearchHelper(driver);
    }

    public void stop() {
        driver.quit();
    }
}
