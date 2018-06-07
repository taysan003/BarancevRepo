package ru.stqa.training.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class MyFirstTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
       /* ChromeOptions options = new ChromeOptions();
        options.addArguments("start-fullscreen");
        *//*driver = new ChromeDriver(options);*//*
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(caps);

        wait = new WebDriverWait(driver, 10);*/



        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);

       /* DesiredCapabilities caps = new DesiredCapabilities();

        driver = new FirefoxDriver(caps);
        System.out.println(((HasCapabilities) driver).getCapabilities());
        wait = new WebDriverWait(driver, 10);*/

       /* driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);*/


       /* driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);*/

        /*DesiredCapabilities caps = new DesiredCapabilities();*/
/*
        FirefoxBinary bin = new FirefoxBinary(new File("c:\\Program Files\\Firefox Nightly\\firefox.exe"));
        WebDriver driver = new FirefoxDriver(bin, new FirefoxProfile());


        System.out.println(((HasCapabilities) driver).getCapabilities());
        wait = new WebDriverWait(driver, 10);*/







      /* driver = new InternetExplorerDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       wait = new WebDriverWait(driver, 10);*/

    }

    @Test
    public void mySecondTest(){
        List<WebElement> web;
        driver.get("http://localhost/litecart/en/");
       /* web = driver.findElements(By.xpath("//div[@id='box-most-popular']//" +
                "div[@class='content']//ul[@class='listing-wrapper products']"));*/
        /*List<WebElement> web2=driver.findElements(By.xpath("//html//div[@id='box-most-popular']//li[1]"));*/
        List<WebElement> web3 = driver.findElements(By.cssSelector(".sticker new"));
        for (int i = 0; i <web3.size() ; i++) {
                 web3.get(i).click();
        }

    }

    @Test
    public void myFirstTest()  {

        driver.get("http://localhost/litecart/admin/login.php");


        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();


        WebElement menue1 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Appearence')]"));
        menue1.click();
        String header = driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).getText();

        String XPath = "//*[@id=\"content\"]/h1";
        Boolean iselementpresent = driver.findElements(By.xpath(XPath)).size()!= 0;
        if (iselementpresent == true)
        {
            System.out.print(XPath+ " Is Present On The Page");
        }
        else
        {
            System.out.print(XPath+" Is Not Present On The Page");
        }


        WebElement menue1_1 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Template')]"));
        menue1_1.click();
        WebElement menue1_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Logotype')]"));
        menue1_2.click();
        WebElement menue3 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Catalog')]"));
        menue3.click();
        WebElement menue3_1 = driver.findElement(By.xpath("//li[@id='doc-catalog']//a[@href='http://localhost/" +
                                               "litecart/admin/?app=catalog&doc=catalog']//span[@class='name']"));
        menue3_1.click();
        WebElement menue3_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Product Groups')]"));
        menue3_2.click();
        WebElement menue3_3 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Option Groups')]"));
        menue3_3.click();
        WebElement menue3_4 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Manufacturers')]"));
        menue3_4.click();
        WebElement menue3_5 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Delivery Statuses')]"));
        menue3_5.click();
        WebElement menue3_6 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Suppliers')]"));
        menue3_6.click();
        WebElement menue3_7 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Sold Out Statuses')]"));
        menue3_7.click();
        WebElement menue3_8 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Quantity Units')]"));
        menue3_8.click();
        WebElement menue3_9 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'CSV Import/Export')]"));
        menue3_9.click();
        WebElement menue4 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Countries')]"));
        menue4.click();
        WebElement menue5 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Currencies')]"));
        menue5.click();
        WebElement menue6 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Customers')]"));
        menue6.click();
        WebElement menue6_1 = driver.findElement(By.xpath("//li[@id='doc-customers']//a[@href='http://localhost/" +
                "litecart/admin/?app=customers&doc=customers']//span[@class='name']"));
        menue6_1.click();
        WebElement menue6_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'CSV Import/Export')]"));
        menue6_2.click();
        WebElement menue6_3 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Newsletter')]"));
        menue6_3.click();

        WebElement menue7 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Geo Zones')]"));
        menue7.click();
        WebElement menue8 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Languages')]"));
        menue8.click();
        WebElement menue8_1 = driver.findElement(By.xpath("//li[@id='doc-languages']//a[@href='http://localhost/" +
                "litecart/admin/?app=languages&doc=languages']//span[@class='name']"));
        menue8_1.click();
        WebElement menue8_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Storage Encoding')]"));
        menue8_2.click();
        WebElement menue9 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Modules')]"));
        menue9.click();
        WebElement menue9_1 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Background Jobs')]"));
        menue9_1.click();
        WebElement menue9_2 = driver.findElement(By.xpath("//a[@href='http://localhost/litecart/admin/?app=modules&doc=customer']" +
                "//span[@class='name']"));
        menue9_2.click();
        WebElement menue9_3 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Shipping')]"));
        menue9_3.click();
        WebElement menue9_4 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Payment')]"));
        menue9_4.click();
        WebElement menue9_5 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Order Total')]"));
        menue9_5.click();
        WebElement menue9_6 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Order Success')]"));
        menue9_6.click();
        WebElement menue9_7 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Order Action')]"));
        menue9_7.click();
        WebElement menue10 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Orders')]"));
        menue10.click();
        WebElement menue10_1 = driver.findElement(By.xpath("//li[@id='doc-orders']//a[@href='http://localhost/" +
                "litecart/admin/?app=orders&doc=orders']//span[@class='name']"));
        menue10_1.click();
        WebElement menue10_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Order Statuses')]"));
        menue10_2.click();

        WebElement menue12 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Pages')]"));
        menue12.click();
        WebElement menue13 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Reports')]"));
        menue13.click();
        WebElement menue13_1 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Monthly Sales')]"));
        menue13_1.click();
        WebElement menue13_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Most Sold Products')]"));
        menue13_2.click();
        WebElement menue13_3 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Most Shopping Customers')]"));
        menue13_3.click();
        WebElement menue14 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Settings')]"));
        menue14.click();
        WebElement menue14_1 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Store Info')]"));
        menue14_1.click();
        WebElement menue14_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Defaults')]"));
        menue14_2.click();
        WebElement menue14_3 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'General')]"));
        menue14_3.click();
        WebElement menue14_4 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Listings')]"));
        menue14_4.click();
        WebElement menue14_5 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Images')]"));
        menue14_5.click();
        WebElement menue14_6 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Checkout')]"));
        menue14_6.click();
        WebElement menue14_7 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Advanced')]"));
        menue14_7.click();
        WebElement menue14_8 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Security')]"));
        menue14_8.click();
        WebElement menue15 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Slides')]"));
        menue15.click();
        WebElement menue16 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Tax')]"));
        menue16.click();
        WebElement menue16_1 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Tax Classes')]"));
        menue16_1.click();
        WebElement menue16_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Tax Rates')]"));
        menue16_2.click();
        WebElement menue17 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Translations')]"));
        menue17.click();
        WebElement menue17_1 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Search Translations')]"));
        menue17_1.click();
        WebElement menue17_2 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Scan Files')]"));
        menue17_2.click();
        WebElement menue17_3 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'CSV Import/Export')]"));
        menue17_3.click();
        WebElement menue18 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'Users')]"));
        menue18.click();
        WebElement menue19 = driver.findElement(By.xpath("//span[@class='name'][contains(text(),'vQmods')]"));
        menue19.click();
        WebElement menue19_1 = driver.findElement(By.xpath("//li[@id='doc-vqmods']//a[@href='http://" +
                "localhost/litecart/admin/?app=vqmods&doc=vqmods']//span[@class='name']"));
        menue19_1.click();

    }

    @After
   /* private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }*/
    public void stop() {
        driver.quit();
        driver = null;
    }
}
