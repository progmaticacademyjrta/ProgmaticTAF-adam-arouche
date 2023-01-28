package hu.progmatic.driverfactory;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DriverBaseTest {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;

    @BeforeEach
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

        //Creating an object of ChromeDriver
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofMillis(30000));
        driver.manage().window().maximize();
        //Deleting all the cookies
        driver.manage().deleteAllCookies();

        //Specifiying pageLoadTimeout and Implicit wait
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(30000));
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(30000));

        actions = new Actions(driver);
    }

    @AfterEach
    public void driverCleanUp() {
        driver.quit();
    }
}
