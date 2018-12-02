package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PageObject;
import pages.webAction.MessageWithoutTitle;

import java.util.logging.Logger;

public class MessageWithoutTitlePage extends PageObject implements MessageWithoutTitle {
    private WebDriver driver;
    private static Logger log = Logger.getLogger(MessageWithoutTitle.class.getName());

    public MessageWithoutTitlePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@name=\"ok\"]")
    public WebElement ok;

    @FindBy(xpath = "//div[@tabindex=\"1\"][contains(.,\"Одержувачі\")]")
    public WebElement to;

    @Override
    public void clickOk() {
        try {

            ok.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void clickTo() {
        try {

            to.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public Boolean isMes() {
        WebElement element = driver.findElement(By.xpath("//*[@class=\"z0\"]//*"));
        return element.isDisplayed();
    }
}
