package Framework;

import Utils.MyListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    String browser;
   // WebDriver driver;
    EventFiringWebDriver driver;
    SearchHelper search;

    public ApplicationManager(String browser) {
        this.browser = browser;
    }

    public SearchHelper getSearch() {
        return search;
    }

    public void init() {
        if(browser.equals(BrowserType.CHROME)){
            //driver = new ChromeDriver();
            driver = new EventFiringWebDriver(new ChromeDriver());
        } else if (browser.equals(BrowserType.FIREFOX)) {
            driver = new EventFiringWebDriver(new FirefoxDriver());
        }
        driver.get("https://ya.ru");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        search = new SearchHelper(driver);
        driver.register(new MyListener());
    }

    public void stop() {
        driver.quit();
    }
}
