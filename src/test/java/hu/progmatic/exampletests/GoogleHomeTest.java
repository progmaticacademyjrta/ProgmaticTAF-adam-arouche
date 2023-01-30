package hu.progmatic.exampletests;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.testng.annotations.Test;

public class GoogleHomeTest extends DriverBaseTest {

    @Test(enabled = false, description = "Open google.hu")
    public void openGoogleHomeScreenTest() {
        driver.get("https://google.hu");
    }

    @Test(enabled = false, description = "Open google.de")
    public void openGoogleHomeScreen2Test() {
        driver.get("https://google.de");
    }
}
