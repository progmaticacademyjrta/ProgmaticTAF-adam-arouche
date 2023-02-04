package hu.progmatic.testcases;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.pages.LoginPage;
import hu.progmatic.pages.ProfilPage;
import org.testng.annotations.Test;

public class ProfilPageTests extends DriverBaseTest {
    String username = "John Doe";
    String password = "ThisIsNotAPassword";
    LoginPage loginPage;
    ProfilPage profilpage;

    @Test(description = "Find the login page and the correct URL")
    public void findProfil() {
        loginPage = new LoginPage(driver, wait);
        loginPage.login(username, password);
        profilpage = new ProfilPage(driver, wait);
        profilpage.validateProfilPage();

    }

    @Test(description = "Working logout button on profil page")
    public void logOutTest() {
        loginPage = new LoginPage(driver, wait);
        loginPage.login(username, password);
        profilpage = new ProfilPage(driver, wait);
        profilpage.logoutButton();

    }
}
