package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends DriverBaseTest {
    LoginPage loginPage;

    @Test(description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.",
            groups = {"chritical"})
    public void loadLoginPage() {
        loginPage = new LoginPage(driver, wait);
        loginPage.loadLoginPage();
    }

    @Test(description = "Check if the Username and Passwords are both wrong", groups = {"secondary"})
    public void wrongUsernameWrongPass() {
        loginPage = new LoginPage(driver, wait);
        loginPage.wrongUsernameWrongPass();
    }

    @Test(description = "Check if the Username is correct,but Passwords is wrong", groups = {"secondary"})
    public void correctUsernameWrongPass() {
        loginPage = new LoginPage(driver, wait);
        loginPage.correctUserWrongPass();
    }

    @Test(description = "Check if the Username is wrong and Passwords is ok", groups = {"secondary"})
    public void wrongUsernameCorrectPass() {
        loginPage = new LoginPage(driver, wait);
        loginPage.wrongUserCorrectPass();
    }
}
