package driver;

import org.openqa.selenium.WebDriver;

public interface DriverFactory {
    WebDriver openDriver();
    //void cleanUp();
    void tearDown();

}
