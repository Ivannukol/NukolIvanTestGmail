package gmail;

import bissines.Gmail;
import driver.Chrom;
import driver.DriverFactory;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.PageFactory;
import pages.WebPageFactory;



import static org.testng.Assert.assertTrue;


public class test extends Chrom {
    protected DriverFactory driverFactory;
    protected PageFactory pageFactory;
    protected Gmail gmail;

    public test() {
        this.driverFactory = new Chrom();
        this.pageFactory = new WebPageFactory(driverFactory);
    }


    @BeforeMethod
    protected void getDriver() {
        gmail = new Gmail(pageFactory);
        gmail.in(ne.email, ne.password);
    }


    @Test(dataProvider = "td", dataProviderClass=DataProvider.class)
    public void Task1(String to,String[] letter) {
        gmail.sedMessage(to, letter[0], letter[1]);
        assertTrue(gmail.isMesege());

    }

    @Test(dataProvider = "td", dataProviderClass=DataProvider.class)
    public void Task2(String to,String[] letter) {
        gmail.task2(to, letter[0], letter[1]);
        assertTrue(gmail.isDrafts());

    }



    @Test(dataProvider = "td1", dataProviderClass=DataProvider.class)
    public void Task3(int i) {
        gmail.task3(i);
        assertTrue(gmail.isMesege());

    }
    @Test(dataProvider = "td", dataProviderClass=DataProvider.class)
    public void Task4(String to,String[] letter) {

        gmail.task4("", letter[0], letter[1],to);
        assertTrue(gmail.isMesege());

    }

}












