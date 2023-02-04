package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class AppointmentPage {
    WebDriver driver;
    WebDriverWait wait;

    public AppointmentPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void validateAppointmentPage() {
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        System.out.println("Appointment page logged in");
    }

    public void bookAppointmentClick() throws InterruptedException {
        WebElement datePicker = driver.findElement(By.id("txt_visit_date"));
        datePicker.click();
        Thread.sleep(1000);
        WebElement chooseDate = driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[1]/td[7]"));
        chooseDate.click();
        WebElement bookButton = driver.findElement(By.id("btn-book-appointment"));
        bookButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/appointment.php#summary");
        System.out.println("Booked Appointment");
    }
}

