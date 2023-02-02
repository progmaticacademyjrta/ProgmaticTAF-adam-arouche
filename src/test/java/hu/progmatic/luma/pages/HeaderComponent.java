package hu.progmatic.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HeaderComponent {
    WebDriver driver;

    By womenMenu = By.id("ui-id-4");
    By topsMenu = By.id("ui-id-9");
    By jacketsMenu = By.id("ui-id-11");

    public HeaderComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToJacketsMenu() {
        WebElement womenMenuItem = driver.findElement(womenMenu);
        WebElement topsMenuItem = driver.findElement(topsMenu);
        WebElement jacketsMenuItem = driver.findElement(jacketsMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(womenMenuItem);
        actions.moveToElement(topsMenuItem);
        jacketsMenuItem.click();
    }
}
