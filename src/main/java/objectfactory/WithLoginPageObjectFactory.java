package objectfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WithLoginPageObjectFactory {

    WebDriver driver;

    public WithLoginPageObjectFactory(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement signInButton;

    @FindBy(id = "ap_email")
    public WebElement emailOrMobile;

    @FindBy(id = "continue")
    public WebElement continueButton;

    @FindBy(id = "ap_password")
    public WebElement password;

    @FindBy(id = "signInSubmit")
    public WebElement signIn;

    @FindBy(id = "nav-link-accountList")
    public WebElement myAccount;

    @FindBy(xpath = "(//a[@class='ya-card__whole-card-link'])[1]")
    public WebElement yourOrders;

    @FindBy(id = "time-filter")
    public WebElement yearDropdown;

    @FindBy(xpath = "(//div[@class='a-row a-size-base'])[1]")
    public WebElement orderedDate;

    @FindBy(xpath = "(//a[@class='ya-card__whole-card-link'])[5]")
    public WebElement paymentOptions;

    @FindBy(id = "apx-add-credit-card-action-test-id")
    public WebElement addCard;

    @FindBy(className = "apx-secure-iframe")
    public WebElement addCardFrame;

    @FindBy(name = "addCreditCardNumber")
    public WebElement cardNumber;

    @FindBy(name = "ppw-accountHolderName")
    public WebElement cardHolderName;

    @FindBy(name = "ppw-expirationDate_month")
    public WebElement cardExpiryMonth;

    @FindBy(name = "ppw-expirationDate_year")
    public WebElement cardExpiryYear;

    @FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
    public WebElement addCardSubmitButton;

    @FindBy(name = "ppw-widgetEvent:SelectAddressEvent")
    public WebElement useThisAddressBtn;

    @FindBy(xpath = "(//a[@class='ya-card__whole-card-link'])[4]")
    public WebElement yourAddresses;

    @FindBy(id = "ya-myab-address-add-link")
    public WebElement addAddressButton;

    @FindBy(id = "address-ui-widgets-enterAddressFullName")
    public WebElement fullName;

    @FindBy(id = "address-ui-widgets-enterAddressPhoneNumber")
    public WebElement mobileNumber;

    @FindBy(id = "address-ui-widgets-enterAddressPostalCode")
    public WebElement pincode;

    @FindBy(id = "address-ui-widgets-enterAddressLine1")
    public WebElement addressLine1;

    @FindBy(id = "address-ui-widgets-enterAddressLine2")
    public WebElement addressLine2;

    @FindBy(xpath = "//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']")
    public WebElement addAddressBtn;

    @FindBy(xpath = "//h4[@class='a-alert-heading']")
    public WebElement addressAddedMessage;

    public WebElement signInButton(){
        return signInButton;
    }

    public WebElement emailOrMobile(){
        return emailOrMobile;
    }

    public WebElement continueButton(){
        return continueButton;
    }

    public WebElement password(){
        return password;
    }

    public WebElement signIn(){
        return signIn;
    }

    public WebElement myAccount(){
        return myAccount;
    }

    public WebElement yourOrders(){
        return yourOrders;
    }

    public WebElement yearDropdown(){
        return yearDropdown;
    }

    public WebElement orderedDate(){
        return orderedDate;
    }

    public WebElement paymentOptions(){
        return paymentOptions;
    }

    public WebElement addCard(){
        return addCard;
    }

    public WebElement cardNumber(){
        return cardNumber;
    }

    public WebElement addCardFrame(){
        return addCardFrame;
    }

    public WebElement cardHolderName(){
        return cardHolderName;
    }

    public WebElement cardExpiryMonth(){
        return cardExpiryMonth;
    }

    public WebElement cardExpiryYear(){
        return cardExpiryYear;
    }

    public WebElement addCardSubmitButton(){
        return addCardSubmitButton;
    }

    public WebElement useThisAddressBtn(){
        return useThisAddressBtn;
    }

    public WebElement yourAddresses(){
        return yourAddresses;
    }

    public WebElement addAddressButton(){
        return addAddressButton;
    }

    public WebElement fullName(){
        return fullName;
    }

    public WebElement mobileNumber(){
        return mobileNumber;
    }

    public WebElement pincode(){
        return pincode;
    }

    public WebElement addressLine1(){
        return addressLine1;
    }

    public WebElement addressLine2(){
        return addressLine2;
    }

    public WebElement addAddressBtn(){
        return addAddressBtn;
    }

    public WebElement addressAddedMessage(){
        return addressAddedMessage;
    }
}
