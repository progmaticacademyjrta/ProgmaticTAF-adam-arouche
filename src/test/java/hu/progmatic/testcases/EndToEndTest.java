package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.HomePage;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EndToEndTest extends DriverBaseTest {
    String username = "John Doe";
    String password = "ThisIsNotAPassword";
    AppointmentPage appointmentpage;
    HomePage homePage;
    LoginPage loginPage;
    ProfilPage profilpage;

    @Test(description = "End to end test running from the login to the logout")
    public void endToEnd() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        appointmentpage = new AppointmentPage(driver, wait);
        profilpage = new ProfilPage(driver, wait);
        homePage.loadHomePage();
        loginPage.login(username, password);
        appointmentpage.bookAppointmentClick();
        profilpage.logoutButton();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println("End to end test successful");

    }
}
