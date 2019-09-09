package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.DriverUtil;

public class AddUserPage extends DriverUtil {

    By ClickAddUserButton = By.xpath("//a[@href='addauser.php'][contains(.,'3. Add a User')]");
    By EnterUserName = By.name("username");
    By EnterPassWord = By.name("password");
    By ClickSaveButton = By.xpath("//input[@value='save']");
    By ValidateHomepage = By.xpath("(//a[@href='http://php.thedemosite.co.uk/'][contains(.,'PHP and MySQL')])[1]");


    public void validateLandingPage()throws InterruptedException{
        Boolean status = driver.findElement(ValidateHomepage).isDisplayed();
        if (status){
            System.out.println("Landing page is displayed");
        }else {
            System.out.println("Landing page is not displayed");
        }
        Thread.sleep(3000);
    }

    public void clickAddUserButton (){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(ClickAddUserButton)).click();
    }

    public void enterUserNameAndPassWord(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(EnterUserName)).sendKeys("Correct");
        driver.findElement(EnterPassWord).sendKeys("Password");
    }

    public void clickSaveButton (){
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(ClickSaveButton)).click();
    }

    public void verifyUserIsRegistered (){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.urlContains("savedata.php"));
        if (driver.getCurrentUrl().contains("http://thedemosite.co.uk/savedata.php")){
            System.out.println("User Registration Successful");
        }else {
            System.out.println("Registration not Successful");
        }
    }
}
