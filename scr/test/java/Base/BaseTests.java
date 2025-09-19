package Base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galin\\IdeaProjects\\QA-Automation-Test-Automation-University\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

        //driver.manage().window().setSize(new Dimension(375, 812));
        //System.out.println(driver.getTitle());

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public static void main(String[] arg) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
