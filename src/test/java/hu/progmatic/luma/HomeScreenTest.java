package hu.progmatic.luma;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.luma.pages.HomePage;
import org.testng.annotations.Test;

public class HomeScreenTest extends DriverBaseTest {
    HomePage homePage;

    @Test
    public void homepageLoadedTest(){
        homePage = new HomePage(driver);
        homePage.loadHomePage();
        /* pl ha visszaadna egy WebElementet a teszt lépés
        WebElement whatsnewMenuItem = homePage.loadHomePage();
        Assert.assertTrue(whatsnewMenuItem.isDisplayed());
        */
    }

}
