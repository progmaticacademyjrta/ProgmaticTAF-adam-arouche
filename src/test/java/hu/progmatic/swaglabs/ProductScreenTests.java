package hu.progmatic.swaglabs;

import hu.progmatic.driverfactory.DriverBaseTest;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ProductScreenTests extends DriverBaseTest {

    @BeforeEach
    public void createSession() throws InterruptedException {
        driver.get("https://www.saucedemo.com");
        login();
    }

    @Test
    public void defaultSortOptionTest() throws InterruptedException {
        WebElement selectedFilterOption = driver.findElement(By.xpath("//div[@class='right_component']//span[@class='active_option']"));
        Assert.assertEquals ("NAME (A TO Z)", selectedFilterOption.getText());
    }

    @Test
    public void firstItemInAToZDraftTest() throws InterruptedException {
        WebElement firstElement = driver.findElement(By.id("item_4_title_link"));
        Assert.assertEquals ("Sauce Labs Backpack", firstElement.getText());
        // We could get all the items in a list, and check the texts
        // List<WebElement> items = driver.findElements(By.className("inventory_item_name"));
    }

    @Test
    public void firstItemInAToZTest() throws InterruptedException {
        List<WebElement> items = driver.findElements(By.className("inventory_item_name"));
        /*for (WebElement item : items) {
            System.out.println(item.getText());
        }*/
        String firstItemTitle = items.get(0).getText();
        Assert.assertEquals ("Sauce Labs Backpack", firstItemTitle);
    }

    @Test
    public void clickOnItemPictureAndRedirectTest() throws InterruptedException {
        WebElement itemPicture = driver.findElement(By.cssSelector("img[alt='Sauce Labs Backpack']"));
        itemPicture.click();
        Assert.assertEquals ("https://www.saucedemo.com/inventory-item.html?id=4", driver.getCurrentUrl());
    }

    @Test
    public void clickOnItemTitleAndRedirectTest() throws InterruptedException {
        WebElement itemPicture = driver.findElement(By.linkText("Sauce Labs Backpack"));
        itemPicture.click();
        //WebElement backToProductsButton = driver.findElement(By.id("back-to-products"));
        //WebElement backToProductsButton = driver.findElement(By.cssSelector("button[data-test='back-to-products']"));
        //WebElement backToProductsButton = driver.findElement(By.name("back-to-products"));
        WebElement backToProductsButton = driver.findElement(By.xpath("//*[@id='back-to-products']"));
        Assert.assertTrue(backToProductsButton.isDisplayed());
    }


    private void login() throws InterruptedException {
        WebElement usernameInput  = driver.findElement(By.id("user-name"));
        usernameInput.sendKeys("standard_user");
        WebElement pwdInput = driver.findElement(By.id("password"));
        pwdInput.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        // check landing page
        Thread.sleep(2000);
        Assert.assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());
    }

}
