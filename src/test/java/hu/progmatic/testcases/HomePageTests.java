package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.HomePage;
import org.testng.annotations.Test;

public class HomePageTests extends DriverBaseTest {
    HomePage homePage;

    @Test(description = "TC01: Homepage loaded test that loads the page and validates whether the header is displayed or not.")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
    }

    @Test(description = "Make appointment button is clickable", groups = {"chritical"})
    public void makeAppointmentClickable() throws InterruptedException {
        homePage = new HomePage(driver, wait);
        homePage.loadHomePage();
        Thread.sleep(2000);
        homePage.makeAppointmentClickable();

    }
}
