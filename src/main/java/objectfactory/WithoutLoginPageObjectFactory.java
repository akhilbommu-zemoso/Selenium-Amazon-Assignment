package objectfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithoutLoginPageObjectFactory {

    WebDriver driver;

    public WithoutLoginPageObjectFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='/deals?ref_=nav_cs_gb']")
    WebElement todaysDeals;

    @FindBy(xpath = "(//div[@class='DealGridItem-module__dealItemDisplayGrid_e7RQVFWSOrwXBX4i24Tqg DealGridItem-module__withBorders_2jNNLI6U1oDls7Ten3Dttl DealGridItem-module__withoutActionButton_2OI8DAanWNRCagYDL2iIqN'])[7]")
    WebElement thirdItemInTodaysDeals;

    @FindBy(xpath = "(//li[@class='a-list-normal a-spacing-none no-margin-right overflow-hidden octopus-response-li-width'])[1]")
    WebElement requiredItem;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    WebElement addToCart;

    @FindBy(id = "nav-cart-count")
    WebElement cartCount;

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBox;

    @FindBy(id = "nav-search-submit-text")
    WebElement searchButton;

    @FindBy(id = "nav-hamburger-menu")
    WebElement leftNav;

    @FindBy(xpath = "//div[text()='Mobiles, Computers']")
    WebElement mobilesAndComputersInLeftNav;

    @FindBy(xpath = "//a[text()='All Mobile Phones']")
    WebElement allMobilePhones;

    public WebElement todaysDeals(){
        return todaysDeals;
    }

    public WebElement thirdItemInTodaysDeals(){
        return thirdItemInTodaysDeals;
    }

    public WebElement requiredItem(){
        return requiredItem;
    }

    public WebElement addToCart(){
        return addToCart;
    }

    public WebElement cartCount(){
        return cartCount;
    }

    public WebElement searchBox(){
        return searchBox;
    }

    public WebElement searchButton(){
        return searchButton;
    }

    public WebElement leftNav(){
        return leftNav;
    }

    public WebElement mobilesAndComputersInLeftNav(){
        return mobilesAndComputersInLeftNav;
    }

    public WebElement allMobilePhones(){
        return allMobilePhones;
    }
}
