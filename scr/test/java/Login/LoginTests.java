package Login;

import Base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {


    @Test
    public void testSuccessfulLogin() {
        LoginPage loginPage = homePage.clickAuthenticationForm();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        secureAreaPage.getAleartText();

        assertEquals(secureAreaPage.getAleartText(),
                "You logged into a secure area!\n" +
                        "×",
                "Aleart text is incorrect!");
    }
}

