package hu.progmatic.exampletests;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.testng.annotations.Test;

public class ProgmaticHomeTest extends DriverBaseTest {

    @Test(enabled = false)
    public void openProgmaticHomeScreenTest() {
        driver.get("https://progmatic.hu");
    }
}
