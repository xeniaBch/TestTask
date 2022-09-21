package Framework;

import Model.CategoryObject;
import Model.FilterItem;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class SearchHelper extends HelperBase{

    public SearchHelper(WebDriver driver) {
        super(driver);
    }
    public void typeInSearchInputField(String itemName) {
        type(By.id("header-search"),itemName);
        click(By.cssSelector("[data-r='search-button']"));
    }

    public void acceptCookies() {
        click(By.cssSelector("[data-id='button-all']"));
    }

    public String getItemNameByOrder(int number) {
        return driver.findElement(By.cssSelector("div:nth-child(" + number + ") ._2UHry")).getText();
    }

    public void filterItem(FilterItem filterItem) {
        type(By.cssSelector("span._1heDd:nth-child(1) [class='_3qxDp']"), filterItem.getValue1());
        type(By.cssSelector("span._1heDd:nth-child(2) [class='_3qxDp']"), filterItem.getValue2());
        pause(4000);
        click(By.xpath("//span[text()='"+ filterItem.getBrand() +"']"));
    }

    public void jumpDown() {
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
    }

    public void selectCategory(CategoryObject categoryObject) {
        click(By.cssSelector("[href='/catalog--" + categoryObject.getCategory() + "/list?filter-express-delivery=1&searchContext=express']"));
        click(By.cssSelector("[href='/catalog--"+ categoryObject.getSubcategory() + "?how=dpop&glfilter=&cvredirect=3&filter-express-delivery=1&searchContext=express&track=srch_ddl']"));
    }

    public void switchToNextTab(int number) {
        List<String> availableTabs = new ArrayList<>(driver.getWindowHandles());
        if (!availableTabs.isEmpty()) {
            driver.switchTo().window(availableTabs.get(number));
        }
    }

    public void selectExpressDepartment() {
        click(By.xpath("//span[text()='Экспресс']"));
    }

    public void selectMarket() {
        click(By.cssSelector(".home-link2.services-pinned__item.services-pinned__all"));
        click(By.xpath("//*[text()='Маркет']"));
    }
}
