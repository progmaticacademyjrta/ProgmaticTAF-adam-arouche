package hu.progmatic.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProfilPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void validateProfilPage() {
        WebElement searchButton = driver.findElement(By.id("menu-toggle"));
        searchButton.click();
        WebElement profilButton = driver.findElement(By.linkText("Profile"));
        profilButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#profile");
        System.out.println("Profil page loaded in");
    }

    public void logoutButton() {
        WebElement searchButton = driver.findElement(By.id("menu-toggle"));
        searchButton.click();
        WebElement profilButton = driver.findElement(By.linkText("Profile"));
        profilButton.click();
        WebElement logoutButton = driver.findElement(By.linkText("Logout"));
        logoutButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/");
        System.out.println("Logging out success");
    }
}
