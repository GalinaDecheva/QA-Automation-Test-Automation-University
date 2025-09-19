package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameFiled = By.id("username");
    private By passwordFiled = By.id("password");
    private By loginButton = By.cssSelector("button.radius");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(userNameFiled).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordFiled).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
