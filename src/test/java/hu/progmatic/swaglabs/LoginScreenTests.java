package hu.progmatic.swaglabs;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreenTests extends DriverBaseTest {

    //valid username empty pwd
    @Test
    public void validUsernameEmptyPwdTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");
        WebElement pwdInput = driver.findElement(By.id("password"));

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(3000);
    }
}
