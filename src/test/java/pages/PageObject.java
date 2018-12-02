package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.webAction.Page;

public class PageObject implements Page {
    WebDriver driver;
    WebDriverWait webDriverWait;

    public PageObject(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 60);

    }

    @Override
    public void back() {
        driver.navigate().back();
    }

    @Override
    public void forward() {
        driver.navigate().forward();
    }

    @Override
    public void refresh() {
        driver.navigate().refresh();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void to(String url) {
        driver.navigate().to(url);
    }
}
