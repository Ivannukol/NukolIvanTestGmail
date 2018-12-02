package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PageObject;
import pages.webAction.DraftSendMessage;

import java.util.logging.Logger;

public class DraftSendMessagePage extends PageObject implements DraftSendMessage {
    private WebDriver driver;
    private static Logger log = Logger.getLogger(DraftSendMessage.class.getName());

    public DraftSendMessagePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    @FindBy(xpath = "//*[@class=\"Ha\"]")
    public WebElement closeMessage;

    @FindBy(xpath = "//*[@href=\"https://mail.google.com/mail/u/0/#drafts\"]")
    public WebElement openDrafts;

    @FindBy(xpath = "//*[@role=\"main\"]//tbody//*[5]")
    public WebElement openMessage;

    @FindBy(xpath = "//*[@href=\"https://mail.google.com/mail/u/0/#drafts\"]")
    public WebElement openDrafts4;

    @Override
    public void clickCloseMessage() {
        try {

            closeMessage.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void clicOpenDrafts() {
        try {

            openDrafts.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void clickOpenMessage() {
        try {

            openMessage.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public Boolean isMesege() {
        WebElement element;
        try {

            element = driver.findElement(By.xpath("//*[@class=\"z0\"]//*"));
        } catch (Exception e) {
            log.warning("Помилка");
            return false;

        }
        return element.isDisplayed();

    }


}
