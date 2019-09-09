package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverUtil;

public class LoginPage extends DriverUtil {

    By ClickLoginButton = By.xpath("//a[@href='login.php'][contains(.,'4. Login')]");
    By EnterUserName = By.name("username");
    By EnterPassWord = By.name("password");
    By ClickTestLogin = By.xpath("//input[@value='Test Login']");

    public void validateLandingPage (){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.urlContains("savedata.php"));
        if (driver.getCurrentUrl().contains("http://php.thedemosite.co.uk/savedata.php")){
            System.out.println("Landing page is displayed");
        }else{
            System.out.println("Landing page not displayed");
        }
    }

    public void clickLoginButton (){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ClickLoginButton)).click();
    }

    public void enterUserNameAndPassWord(){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(EnterUserName)).sendKeys("Correct");
        driver.findElement(EnterPassWord).sendKeys("Password");
    }

    public void clickTestLoginButton (){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(ClickTestLogin)).click();
    }

    public void validateSuccessfulLogin (){

        if (driver.getPageSource().contains("Successful Login")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Fail");
        }
    }

    // Login in with Invalid credentials

    public  void EnterInvalidUserName (){
        WebDriverWait wait = new WebDriverWait(driver,40);
        wait.until(ExpectedConditions.elementToBeClickable(EnterUserName)).sendKeys("Wrong");
    }

    public void EnterInvalidPassword (){
        driver.findElement(EnterPassWord).sendKeys("Password");
    }

public void validateFailedLogin (){
    if (driver.getPageSource().contains("Failed Login")){
        System.out.println("Login Fail");
    }else{
        System.out.println("Login Pass");
    }
}
}
