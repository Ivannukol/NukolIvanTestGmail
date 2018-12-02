package bissines;


import pages.PageFactory;
import pages.web.AuthorizationPage;
import pages.webAction.SendMessage;
import pages.webAction.DraftSendMessage;
import pages.webAction.DeleteMessage;
import pages.webAction.MessageWithoutTitle;


public class Gmail {
    private AuthorizationPage loginPage;
    private SendMessage task1;
    private DraftSendMessage task2;
    private DeleteMessage task3;
    private MessageWithoutTitle task4;
    private PageFactory pageFactory;

    public Gmail(PageFactory pageFactory) {
        loginPage = pageFactory.getLogin();
        task1 = pageFactory.getCreate();
        this.pageFactory = pageFactory;
        task2 = pageFactory.getTask2();
        task3 = pageFactory.getTask3();
        task4 = pageFactory.getTask4();
    }


    public void in(String email, String password) {


        loginPage.setLogin(email);
        loginPage.setPassword(password);

    }

    public void sedMessage(String to, String subject, String message) {
        task1.clicCreate();
        task1.clicMessage();

        task1.setTo(to);
        task1.setSubject(subject);
        task1.setMessage(message);
        task1.clickSend();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        task1.clickDelete();

    }
    public void task2(String to, String subject, String message) {
        task1.clicCreate();
        task2.clicOpenDrafts();
        task1.setTo(to);
        task1.setSubject(subject);
        task1.setMessage(message);
        task2.clickCloseMessage();
        task2.clickOpenMessage();
        task1.clickSend();

    }

    public void task3(int n) {
        task3.clicCheckBox(n);
        task3.clicDotMenu();
        time(5000);
        task3.importantMessage();
        time(2000);
        task3.messageDelete(n);
    }


    public void task4(String to, String subject, String message, String toEnd) {
        task1.clicCreate();
        task1.clicMessage();
        task1.setTo(to);
        task1.setSubject(subject);
        task1.setMessage(message);
        task1.clickSend();
        task4.clickOk();
        time(1000);
        task4.clickTo();
        task1.setTo(toEnd);


        task1.clickSend();


    }

    Boolean isMes() {
        return task4.isMes();
    }

    public boolean isMesege() {
        return task1.isMesege();
    }

    public boolean isDrafts() {
        return task2.isMesege();
    }

    private void time(int t) {

        try {
            Thread.sleep(t);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
