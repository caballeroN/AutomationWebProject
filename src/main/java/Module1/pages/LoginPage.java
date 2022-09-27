package Module1.pages;

import AbstractComponents.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseClass {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="user_name")
    WebElement username_input;

    @FindBy(id="user_email")
    WebElement userEmail_input;

    @FindBy(id = "password")
    WebElement pass_input;

    @FindBy (id = "allow_marketing_emails")
    WebElement agreeMarketingEmails_checkbox;

    @FindBy(className = "m-v-3-xs")
    WebElement submit_button;

    public void fillForm(String user, String email, String pass){
        username_input.sendKeys(user);
        userEmail_input.sendKeys(email);
        pass_input.sendKeys(pass);
        submit_button.click();
    }




}
