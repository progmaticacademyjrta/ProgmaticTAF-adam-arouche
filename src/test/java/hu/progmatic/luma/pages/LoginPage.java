package hu.progmatic.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    By emailLocator = By.id("email");
    By passwordLocator = By.id("pass");
    By captchaLocator = By.id("captcha_user_login");
    By signInButtonLocator = By.id("send2");

    public void login(String username, String password) {
        WebElement emailInput = driver.findElement(emailLocator);
        WebElement passwordInput = driver.findElement(passwordLocator);
        WebElement captchaInput = driver.findElement(captchaLocator);
        WebElement signInButton = driver.findElement(signInButtonLocator);

        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        captchaInput.sendKeys("someCaptcha");
        signInButton.click();
    }
}
