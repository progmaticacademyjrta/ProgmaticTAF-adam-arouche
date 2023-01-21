package hu.progmatic.swaglabs;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginScreenTests extends DriverBaseTest {

    // TC1: valid username empty pwd
    @Test
    public void validUsernameEmptyPwdTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com");

        // megkeressük a username mezőt és kitöltjük helyes username-el
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");

        // megkeressük a password mezőt, pusztán azért, hogy ezáltal ellenőrzni tudjuk annak megjelenését
        WebElement pwdInput = driver.findElement(By.id("password"));

        // megkeressük a login gombot és rákattintunk
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();

        // kattintás után várunk 2mp-et, hogy a szem le tudja követni mi történik (a teszeset végeztével törölendő, hogy gyorsabban fusson)
        Thread.sleep(2000);

        // megkeressük a hibaüzenetet a felületen (bármely olyan webelement, ahol a szöveg a html tag-ek között az, hogy Epic sadface: Password is required )
        // WebElement errorMessage = driver.findElement(By.xpath("//*[text()='Epic sadface: Password is required']"));
        // VAGY megkeressük a hibaüzenetet oly módon, hogy azon h3 html tag, amelyiknek a data-test attribútumának az értéke az, hogy "error"
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));

        // annak ellenőrzése, hogy az elvárt hibaüzenetet tartalmazza-e az errorMessage html element tag-ek közötti értéke
        Assert.assertEquals("Epic sadface: Password is required", errorMessage.getText());
        // VAGY annak ellenőrzése, hogy az előzetesen megkeresett hibát tartalmazó html element valóban megjelent-e a felületen vagy tovább navigált az oldal
        // Assert.assertTrue(errorMessage.isDisplayed());

        // PÉLDA assertek
        // Assert.assertEquals("alma","korte"); //failed
        // Assert.assertEquals("alma","alma"); //passed
        // Assert.assertTrue(5==7); // failed
        // Assert.assertTrue(7==7); // passed
    }

    // TC2: empty username valid pwd
    @Test
    public void emptyUsernameValidPwdTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement pwdInput = driver.findElement(By.id("password"));
        pwdInput.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals("Epic sadface: Username is required", errorMessage.getText());
    }

    // TC3: empty username empty pwd
    @Test
    public void emptyUsernameEmptyPwdTest() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        WebElement usernameInput = driver.findElement(By.id("user-name"));
        WebElement pwdInput = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.cssSelector("h3[data-test='error']"));
        Assert.assertEquals("Epic sadface: Username is required" , errorMessage.getText());
    }
}
