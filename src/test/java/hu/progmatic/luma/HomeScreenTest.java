package hu.progmatic.luma;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.luma.pages.HeaderComponent;
import hu.progmatic.luma.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeScreenTest extends DriverBaseTest {
    HomePage homePage;
    HeaderComponent header;

    @Test(description = "application loaded")
    public void homepageLoadedTest() {
        homePage = new HomePage(driver);
        homePage.loadHomePage();
        /* pl ha visszaadna egy WebElementet a teszt lépés
        WebElement whatsnewMenuItem = homePage.loadHomePage();
        Assert.assertTrue(whatsnewMenuItem.isDisplayed());
        */
    }

    @Test(description = "check to home navigation")
    public void checkHomeMainNavigationTest() {
        homePage = new HomePage(driver);
        homePage.loadHomePage();
        homePage.clickHomeMainImage();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://magento.softwaretestingboard.com/collections/yoga-new.html");
    }

    @Test(description = "test menu item navigation")
    public void checkWomenMenuItemTest() throws InterruptedException {
        homePage = new HomePage(driver);
        header = new HeaderComponent(driver, wait);
        homePage.loadHomePage();
        header.navigateToWomenMenu();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://magento.softwaretestingboard.com/women.html");
    }

    @Test(description = "check that logo navigates to home page")
    public void navigatesToHomeByLogoTest() throws InterruptedException {
        homePage = new HomePage(driver);
        header = new HeaderComponent(driver, wait);

        homePage.loadHomePage();
        header.navigateToWomenMenu();
        header.clickonLogoImgToNavigateHomePage();
        Assert.assertEquals(driver.getCurrentUrl(),
                "https://magento.softwaretestingboard.com/");
    }
}
