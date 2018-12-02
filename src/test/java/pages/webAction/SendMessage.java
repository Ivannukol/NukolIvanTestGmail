package pages.webAction;

public interface SendMessage extends Page {
    void setTo(String to);
    void setSubject(String subject);
    void setMessage(String message);
    void clickSend();
    void clicMessage();
    void clickDelete();
    void clicCreate();
    boolean isMesege();

}
