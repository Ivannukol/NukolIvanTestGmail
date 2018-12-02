package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PageObject;
import pages.webAction.SendMessage;

import java.util.logging.Logger;


public class SendMessagePage extends PageObject implements SendMessage {
    private WebDriver driver;
    private static Logger log = Logger.getLogger(SendMessage.class.getName());

    public SendMessagePage(WebDriver openDriver) {
        super(openDriver);
        driver = openDriver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@class=\"z0\"]//*")
    public WebElement create;

    @FindBy(xpath = "//*[@name=\"to\"]")
    public WebElement to;

    @FindBy(xpath = "//*[@name=\"subjectbox\"]")
    public WebElement subject;

    @FindBy(xpath = "//*[@role=\"textbox\"]")
    public WebElement message;

    @FindBy(xpath = "//*[@role=\"group\"]//td")
    public WebElement send;

    @FindBy(xpath = ".//*[@href=\"https://mail.google.com/mail/u/0/#sent\"]")
    public WebElement sendMessege;

    @FindBy(xpath = "//*[@role=\"main\"]//tbody//*[8]")
    public WebElement deleteMessege;

    @Override
    public void setTo(String to) {
        try {

            this.to.sendKeys(to);
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void setSubject(String subject) {
        try {

            this.subject.sendKeys(subject);
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void setMessage(String message) {
        try {

            this.message.sendKeys(message);
        } catch (Exception e) {
            log.warning("Помилка");
        }

    }

    @Override
    public void clickSend() {
        try {

            send.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void clicMessage() {
        try {

            sendMessege.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void clickDelete() {
        try {

            deleteMessege.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }


    @Override
    public void clicCreate() {
        try {

            create.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public boolean isMesege() {

        WebElement element = driver.findElement(By.xpath("//*[@class=\"z0\"]//*"));

        return element.isDisplayed();
    }

}
