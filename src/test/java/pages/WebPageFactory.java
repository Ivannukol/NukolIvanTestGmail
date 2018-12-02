package pages;

import driver.DriverFactory;
import pages.web.*;

public class WebPageFactory implements PageFactory {
    private DriverFactory driver;

    public WebPageFactory(DriverFactory driver) {
        this.driver = driver;
    }


    public AuthorizationPage getLogin() {
        return new AuthorizationPage(driver.openDriver());
    }

    @Override
    public SendMessagePage getCreate() {
        return new SendMessagePage(driver.openDriver());
    }

    @Override
    public DraftSendMessagePage getTask2() {
        return new DraftSendMessagePage(driver.openDriver());
    }

    @Override
    public DeleteMessagePage getTask3() {
        return new DeleteMessagePage(driver.openDriver());

    }

    @Override
    public MessageWithoutTitlePage getTask4() {
        return new MessageWithoutTitlePage(driver.openDriver());
    }


}
