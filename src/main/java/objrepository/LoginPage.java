package objrepository;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

    @FindBy(xpath="//android.widget.TextView[@text=\'English\']")
    private WebElement EnglishRadioBtn;

    @FindBy(xpath="//android.widget.Button[@text='CONTINUE']")
    private WebElement continueButton;

    @FindBy(xpath="//android.widget.Button[@text='REGISTER']")
    private WebElement registerBtn;

    @FindBy(xpath="//android.widget.EditText[@text='Mobile no.']")
    private WebElement mobileTextField;

    @FindBy(xpath="//android.widget.TextView[@text='REGISTER']")
    private WebElement registermobileBtn;

    public LoginPage(AppiumDriver driver)

    {
        PageFactory.initElements(driver,this);
    }

    public void loginToApplication()
    {
        continueButton.click();
        System.out.println("POM class is working");
    }


}
