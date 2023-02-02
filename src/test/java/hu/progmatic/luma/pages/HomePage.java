package hu.progmatic.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    By whatsnewMenuBy = By.xpath("//*[@id='ui-id-3']/span");
    //By whatsnewMenuBy = By.xpath("//*[contains(text(),'What')]");
    By welcomeMsg = By.xpath("//*[contains(text(),'Default welcome msg')]");
    By homeMainImageBy = By.className("home-main");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void loadHomePage() {
        driver.get("https://magento.softwaretestingboard.com");
        WebElement whatsnewMenuItem = driver.findElement(welcomeMsg);
        Assert.assertTrue(whatsnewMenuItem.isDisplayed());
        System.out.println("Page loaded properly!");
    }

    public void clickHomeMainImage() {
        WebElement homeMainContent = driver.findElement(homeMainImageBy);
        homeMainContent.click();
    }

    /* pl ha vissza akarnánk adni a Test osztálynak a WebElement-et, hogy dolgozzon tovább vele
    public WebElement loadHomePage(){
        driver.get("https://magento.softwaretestingboard.com");
        WebElement whatsnewMenuItem;
        return whatsnewMenuItem = driver.findElement(whatsnewMenuBy);
    }*/
}
