package hu.progmatic.swaglabs;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.junit.Assert;
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

        WebElement errorMessage = driver.findElement(By.xpath("//*[text()='Epic sadface: Password is required']"));
        Assert.assertEquals("Epic sadface: Password is required", errorMessage.getText());
        // VAGY
        Assert.assertTrue(errorMessage.isDisplayed());

        //Assert.assertEquals("alma","korte"); //failed
        //Assert.assertEquals("alma","alma"); //passed
    }
}
