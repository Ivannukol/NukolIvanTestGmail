package gmail;

import java.util.UUID;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "td")
    public static Object[][] credentials() {

        return new Object[][]{
                {"nuk@gmail.com", new String[]{UUID.randomUUID().toString(), UUID.randomUUID().toString()}},
        };

    }
    @org.testng.annotations.DataProvider(name = "td1")
    public static Object[] unt() {

        return new Object[]{
                3
        };

    }
}
