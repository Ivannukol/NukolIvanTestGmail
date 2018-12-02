package pages.webAction;

public interface Page {
    void back();
    void forward();
    void refresh();
    void close();
    void to(String url);
    //Page waitForPage();
}
