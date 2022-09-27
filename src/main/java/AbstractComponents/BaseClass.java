package AbstractComponents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass  {

    WebDriver driver;
    public BaseClass(WebDriver driver) {

    }

    public void WaitElementToAppear(By findBy){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
    }

    private void setupBrowser(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://sso.teachable.com/secure/9521/identity/sign_up/email?wizard_id=O4x2D7-YroHE6_IbgriMDcjztqtgBrwQ-Iubybc_wF6W8QCi17GiI-9P8gJJqnz_7aL564Ssx7zKwnOdD55Heg");
    }

}
