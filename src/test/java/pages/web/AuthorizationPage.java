package pages.web;

import bissines.Gmail;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PageObject;
import pages.webAction.Authorization;

import java.util.logging.Logger;

public class AuthorizationPage extends PageObject implements Authorization {
    WebDriver driver;
    private static String URL = "https://gmail.com";
    private static Logger log = Logger.getLogger(Authorization.class.getName());

    public AuthorizationPage(WebDriver driver) {
        super(driver);
        driver.navigate().to(URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='identifierId']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='password']//input")
    public WebElement password;

    @Override
    public void setLogin(String login) {
        try {

            email.sendKeys(login);
            email.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void setPassword(String password) {
        try {

            this.password.sendKeys(password);
            this.password.sendKeys(Keys.ENTER);
        } catch (Exception e) {
            log.warning("Помилка");
        }

    }


}
