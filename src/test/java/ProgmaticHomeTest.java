import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProgmaticHomeTest extends DriverBaseTest {

    @Test
    public void openProgmaticHomeScreenTest(){
        driver.get("https://progmatic.hu");
    }

}
