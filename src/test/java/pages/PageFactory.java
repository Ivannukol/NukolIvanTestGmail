package pages;


import pages.web.*;

public interface PageFactory {
    AuthorizationPage getLogin();
    SendMessagePage getCreate();
    DraftSendMessagePage getTask2();
    DeleteMessagePage getTask3();
    MessageWithoutTitlePage getTask4();

}
