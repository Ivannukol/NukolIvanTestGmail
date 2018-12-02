package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chrom implements DriverFactory {
    private WebDriver driver;


    @Override
    public WebDriver openDriver() {
        if (driver != null)
            return driver;
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);



        return driver;



     /*   driver = new ChromeDriver();
        driver.get("https://gmail.com");
        //   driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        //    gmail = new Gmail(driver);*/
    }

    @Override
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
