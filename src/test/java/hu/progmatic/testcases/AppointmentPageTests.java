package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.AppointmentPage;
import hu.progmatic.pages.LoginPage;
import org.testng.annotations.Test;

public class AppointmentPageTests extends DriverBaseTest {
    String username = "John Doe";
    String password = "ThisIsNotAPassword";

    AppointmentPage appointmentpage;

    LoginPage loginPage;

    @Test(description = "Check if we can use the appointment page with correct login and the site loaded",
            groups = {"chritical"})

    public void loadAppointmentPage() {
        loginPage = new LoginPage(driver, wait);
        loginPage.login(username, password);
        appointmentpage = new AppointmentPage(driver, wait);
        appointmentpage.validateAppointmentPage();

    }

    @Test(description = "Check if we can use the appointment page with correct login and the site loaded" , groups = {"chritical"})
    public void bookAppointmentClick() throws InterruptedException {
        loginPage = new LoginPage(driver, wait);
        loginPage.login(username, password);
        appointmentpage = new AppointmentPage(driver, wait);
        appointmentpage.bookAppointmentClick();

    }


}
