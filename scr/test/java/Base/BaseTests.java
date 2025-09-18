package Base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galin\\IdeaProjects\\QA-Automation-Test-Automation-University\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(375, 812));
        System.out.println(driver.getTitle());
        driver.quit();
        System.out.println("Hello World!");
    }

    public static void main(String[] arg) {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
