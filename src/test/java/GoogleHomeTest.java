import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GoogleHomeTest extends DriverBaseTest {

    @Test
    public void openGoogleHomeScreenTest() {
        driver.get("https://google.hu");
    }

    @Test
    public void openGoogleHomeScreen2Test() {
        driver.get("https://google.de");
    }
}
