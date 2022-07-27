package testcases;

import objectfactory.WithoutLoginPageObjectFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WithoutLogin {

    @Test
    public void withoutLoginTest() throws InterruptedException, IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("/home/akhilb/LDP-QA/SeleniumAmazonAssignmentPOM/src/main/resources/data.properties");
        properties.load(fileInputStream);

        System.setProperty("webdriver.chrome.driver", "/home/akhilb/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));

        //our driver can now execute javascripts by doing below
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //using page object factory
        WithoutLoginPageObjectFactory obj = new WithoutLoginPageObjectFactory(driver);

        obj.todaysDeals().click();
        obj.thirdItemInTodaysDeals().click();
        obj.requiredItem().click();
        Assert.assertEquals("0", obj.cartCount().getText());
        obj.addToCart().click();
        Thread.sleep(4000);
        Assert.assertEquals("1", obj.cartCount().getText());
        obj.searchBox().sendKeys(properties.getProperty("searchFor"));
        obj.searchButton().click();

        //window scrolling
        js.executeScript("window.scrollBy(0,5000)");

        obj.leftNav().click();
        Thread.sleep(4000);
        obj.mobilesAndComputersInLeftNav().click();
        obj.allMobilePhones().click();
    }
}
