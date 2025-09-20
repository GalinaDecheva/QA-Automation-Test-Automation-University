package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {


    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickAuthenticationForm();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAleartText();

        assertTrue(secureAreaPage.getAleartText().contains("You logged into a secure area!"), "Aleart text is incorrect!");
    }
}

