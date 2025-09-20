package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    //локатор на елемента

    // констуктор инжектираме драйвъра
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //(driver) е начин да предадем активния
    // браузър от една страница към следващата.
    //Така всички Page Object-и (HomePage, LoginPage, SecureAreaPage)
    // работят върху една и съща сесия на браузъра.
    public LoginPage clickAuthenticationForm() {
        //driver.findElement(formAuthenticationLink).click();
        clickLink("formAuthenticationLink");
        return new LoginPage(driver);
    }

    public DropdownPage clickDropDown(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }


}
