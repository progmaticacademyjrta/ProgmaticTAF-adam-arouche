package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {
    WebDriver driver;
    WebDriverWait wait;
    By headerBy = By.id("top");


    public LoginPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void login(String username, String password){
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement usernameOnTheField = driver.findElement(By.id("txt-username"));
        usernameOnTheField.sendKeys(username);
        WebElement passwordOnTheField = driver.findElement(By.id("txt-password"));
        passwordOnTheField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        loginButton.click();
        System.out.println("Login successful");
    }

    public void loadLoginPage() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement headerElement = driver.findElement(headerBy);
        Assert.assertTrue(headerElement.isDisplayed());
        System.out.println("Login page loaded properly.");
    }

    public void wrongUsernameWrongPass() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("WrongUsername");
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("WrongUsername");
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        loginButton.click();
        WebElement loginFailureMessage = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/p[2]"));
        Assert.assertEquals(loginFailureMessage.getText(), "Login failed! Please ensure the username and password are valid.");
        System.out.println("Login failed! Please ensure the username and password are valid.");
    }


    public void correctUserWrongPass() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("WrongPass");
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        loginButton.click();
        WebElement loginFailureMessage = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/p[2]"));
        Assert.assertEquals(loginFailureMessage.getText(), "Login failed! Please ensure the username and password are valid.");
        System.out.println("Login failed! Please ensure the username and password are valid.In this case it is the password");
    }
    public void wrongUserCorrectPass() {
        driver.get("https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("WrongUSer");
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");
        WebElement loginButton = driver.findElement(By.id("btn-login"));
        loginButton.click();
        WebElement loginFailureMessage = driver.findElement(By.xpath("/html/body/section/div/div/div[1]/p[2]"));
        Assert.assertEquals(loginFailureMessage.getText(), "Login failed! Please ensure the username and password are valid.");
        System.out.println("Login failed! Please ensure the username and password are valid.In this case this is the username");
    }

}

