package hu.progmatic.exampletests;

import hu.progmatic.driverfactory.DriverBaseTest;
import org.junit.jupiter.api.Test;

public class ProgmaticHomeTest extends DriverBaseTest {

    @Test
    public void openProgmaticHomeScreenTest() {
        driver.get("https://progmatic.hu");
    }
}
