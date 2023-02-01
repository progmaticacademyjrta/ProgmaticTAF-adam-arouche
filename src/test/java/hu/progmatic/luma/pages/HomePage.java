package hu.progmatic.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage {
    WebDriver driver;
    By whatsnewMenuBy = By.xpath("//*[@id='ui-id-3']/span");
    //By whatsnewMenuBy = By.xpath("//*[contains(text(),'What')]");

    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    public void loadHomePage(){
        driver.get("https://magento.softwaretestingboard.com");
        WebElement whatsnewMenuItem = driver.findElement(whatsnewMenuBy);
        Assert.assertTrue(whatsnewMenuItem.isDisplayed());
        System.out.println("Page loaded properly!");
    }

    /* pl ha vissza akarnánk adni a Test osztálynak a WebElement-et, hogy dolgozzon tovább vele
    public WebElement loadHomePage(){
        driver.get("https://magento.softwaretestingboard.com");
        WebElement whatsnewMenuItem;
        return whatsnewMenuItem = driver.findElement(whatsnewMenuBy);
    }*/
}
