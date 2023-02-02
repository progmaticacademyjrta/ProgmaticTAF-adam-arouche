package hu.progmatic.luma.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HeaderComponent {
    WebDriver driver;
    WebDriverWait wait;

    By womenMenu = By.id("ui-id-4");
    //By topsMenu = By.id("ui-id-9");
    //By jacketsMenu = By.id("ui-id-11");
    By logoImgBy = By.className("logo");

    public HeaderComponent(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateToWomenMenu() throws InterruptedException {
        WebElement womenMenuItem = wait.until(ExpectedConditions.elementToBeClickable(womenMenu));
        womenMenuItem.click();
        /*WebElement topsMenuItem = driver.findElement(topsMenu);
        Actions actions = new Actions(driver);
        actions.moveToElement(womenMenuItem);
        actions.moveToElement(topsMenuItem);
        WebElement jacketsMenuItem = driver.findElement(jacketsMenu);
        jacketsMenuItem.click();*/
        System.out.println("Navigation to women menu item happened");
    }

    public void clickonLogoImgToNavigateHomePage(){
        WebElement logoImg = driver.findElement(logoImgBy);
        logoImg.click();
        System.out.println("Logo image clicked");
    }
}
