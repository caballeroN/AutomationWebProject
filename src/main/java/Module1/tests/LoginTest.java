package Module1.tests;

import Module1.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @BeforeTest
    setupBrowser();

    @Test
    public void CompleteForm(){
        loginPage.fillForm("Noelia","noeliacaballero@hotmail.com","36814835");
    }
}
