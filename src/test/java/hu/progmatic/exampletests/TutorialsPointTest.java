package hu.progmatic.exampletests;

import hu.progmatic.driverfactory.DriverBaseTest;
import hu.progmatic.exampletests.pages.TutorialsPage;
import org.testng.annotations.Test;

public class TutorialsPointTest extends DriverBaseTest {
    TutorialsPage tutorialsPage;

    @Test
    public void formTest() throws InterruptedException {
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        tutorialsPage = new TutorialsPage(driver, wait);

        tutorialsPage.clickAcceptCookie();
        tutorialsPage.fillFirstNameInput("Zsolt");
        tutorialsPage.fillLastNameInput("Szurovecz");
        tutorialsPage.clickMaleRadio();
        tutorialsPage.clickExperienceRadio();
        tutorialsPage.fillDateInput("2023-01-28");
        tutorialsPage.clickAutomationTesterProfessionCheckbox();
        tutorialsPage.fileUpload("/Users/zsszurovecz/Desktop/progmaticjrta/ProgmaticTAF/src/test/resources/uploadexample.txt");
        tutorialsPage.clickSeleniumFlavourCheckbox();
        tutorialsPage.selectContinentsDropdown("Europe");
        tutorialsPage.selectSeleniumCommandsDropdown("WebElement Commands");
        tutorialsPage.acceptBannerCookieButton();
        tutorialsPage.clickOnSubmitButton();

        driver.switchTo().alert().dismiss(); // a felugró ablak Cancel gombjára kattint
        driver.switchTo().defaultContent(); // WebDriver-t visszaváltja az alapértelmezett ablakra
        Thread.sleep(2000);
    }
}
