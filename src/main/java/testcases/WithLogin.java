package testcases;

import objectfactory.WithLoginPageObjectFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WithLogin {
    @Test
    public void withLoginTest() throws InterruptedException, IOException {

        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream("/home/akhilb/LDP-QA/SeleniumAmazonAssignmentPOM/src/main/resources/data.properties");
        properties.load(fileInputStream);

        System.setProperty("webdriver.chrome.driver", "/home/akhilb/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));

        WithLoginPageObjectFactory obj = new WithLoginPageObjectFactory(driver);

        //signin
        obj.signInButton().click();
        obj.emailOrMobile().sendKeys(properties.getProperty("mobileNumber"));
        obj.continueButton().click();
        obj.password().sendKeys(properties.getProperty("password"));
        obj.signIn().click();

        //going to your orders page
        obj.myAccount().click();
        obj.yourOrders().click();

        //selecting year from dropdown
        Select dropdown = new Select(obj.yearDropdown());
        dropdown.selectByVisibleText("2022");

        //asserting the ordered date of first product
        Assert.assertEquals(properties.getProperty("orderedDate"), obj.orderedDate().getText());

        //adding new payment method
        obj.myAccount().click();
        obj.paymentOptions().click();
        obj.addCard().click();

        Thread.sleep(5000);
        driver.switchTo().frame(obj.addCardFrame());

        obj.cardNumber().sendKeys(properties.getProperty("cardNumber"));
        obj.cardHolderName().sendKeys(properties.getProperty("cardHolderName"));

        Select cardExpiryDropdown = new Select(obj.cardExpiryMonth());
        cardExpiryDropdown.selectByValue(properties.getProperty("expiryMonth"));

        Select cardExpiryYear = new Select(obj.cardExpiryYear());
        cardExpiryYear.selectByValue(properties.getProperty("expiryYear"));

        obj.addCardSubmitButton().click();
        Thread.sleep(4000);
        obj.useThisAddressBtn().click();

        //after performing actions on frame and to comeback to main window
        driver.switchTo().defaultContent();

        //adding new address
        obj.myAccount().click();
        obj.yourAddresses().click();
        obj.addAddressButton().click();
        obj.fullName().sendKeys(properties.getProperty("name"));
        obj.mobileNumber().sendKeys(properties.getProperty("addressMobile"));
        obj.pincode().sendKeys(properties.getProperty("pincode"));
        obj.addressLine1().sendKeys(properties.getProperty("addressLine1"));
        obj.addressLine2().sendKeys(properties.getProperty("addressLine2"));
        obj.addAddressBtn().click();
        Assert.assertEquals(properties.getProperty("addressAddedText"), obj.addressAddedMessage().getText());
    }
}
