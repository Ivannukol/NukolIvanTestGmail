package pages.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pages.PageObject;
import pages.webAction.DeleteMessage;

import java.util.logging.Logger;


public class DeleteMessagePage extends PageObject implements DeleteMessage {
    private WebDriver driver;
    private static Logger log = Logger.getLogger(DeleteMessage.class.getName());

    public DeleteMessagePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@role=\"main\"]//*[@role=\"checkbox\"]/ancestor::div[@role=\"main\"]//parent::*//parent::*//parent::*//parent::*//parent::*/*/div/div/div/div/div/*[7]")
    public WebElement dotMenu;

    @FindBy(xpath = "//a[@href=\"https://mail.google.com/mail/u/0/#imp\"]//parent::*")
    public WebElement importantMessage;
    //div[@role='button'][@title='Delete']


    @FindBy(xpath = "//*[@act=\"10\"][@role=\"button\"][@style=\"user-select: none;\"]/*")
    public WebElement messageDelete;


    @Override
    public void clicCheckBox(int n) {
        try {

            String xpathS = "//*[@role=\"main\"]//*[@role=\"checkbox\"]/ancestor::tbody/*[",
                    xpathE = "]//*[@role=\"checkbox\"]";
            //driver.findElement(By.xpath("//*[@role=\"main\"]//*[@role=\"checkbox\"]/ancestor::tbody/*[3]//*[@role=\"checkbox\"]")).click();
            for (int i = 1; i <= n; i++) {
                WebElement element = driver.findElement(By.xpath(xpathS + i + xpathE));
                if (element.isDisplayed()) {
                    element.click();
                }
            }
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void clicDotMenu() {
        try {

            dotMenu.click();
            dotMenuItem.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void importantMessage() {
        try {

            refresh();
            importantMessage.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }
    }

    @Override
    public void messageDelete(int n) {
        try {

            String xpathS = "//*[@role=\"main\"]//*[@role=\"checkbox\"]/ancestor::tbody/*[",
                    xpathE = "]//*[@role=\"checkbox\"]";
            //driver.findElement(By.xpath("//*[@role=\"main\"]//*[@role=\"checkbox\"]/ancestor::tbody/*[3]//*[@role=\"checkbox\"]")).click();
            for (int i = 1; i <= n; i++) {
                WebElement element = driver.findElement(By.xpath(xpathS + i + xpathE));
                if (element.isDisplayed()) {
                    element.click();
                }
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            messageDelete.click();
        } catch (Exception e) {
            log.warning("Помилка");
        }

    }

    @FindBy(xpath = "//div[@role='menuitem'][contains (.,'Позначити ')]//parent::*//*[4]")
    public WebElement dotMenuItem;

}
