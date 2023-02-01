package hu.progmatic.exampletests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialsPage {
    WebDriverWait wait;
    WebDriver driver;
    Actions actions;
    By cookieButtonBy = By.xpath("//*[contains(text(),'Consent')]");
    By firstNameBy = By.name("firstname");
    By lastNameBy = By.name("lastname");
    By maleRadioBy = By.cssSelector("input[value='Male']");
    By experienceRadioBy = By.cssSelector("input[name='exp'][value='7']");
    By dateInputBy = By.xpath("//*[@id=\"mainContent\"]/div[4]/div/form/table/tbody/tr[5]/td[2]/input");
    By automationTesterCheckboxBy = By.cssSelector("input[value='Automation Tester']");
    By fileUploadBy = By.name("photo");
    By seleniumWebdriverBy = By.cssSelector("input[value='Selenium Webdriver']");
    By continentsDropdownBy = By.cssSelector("select[name='continents']");
    By seleniumCommandsDropdownBy = By.cssSelector("select[name='selenium_commands']");
    By banneracceptBy = By.id("banner-accept");
    By submitButtonBy = By.name("submit");

    public TutorialsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        actions = new Actions(driver);
    }

    public void clickAcceptCookie() {
        WebElement acceptCookieButton = wait.until(ExpectedConditions.elementToBeClickable(cookieButtonBy));
        acceptCookieButton.click();
        System.out.println("acceptCookieButton clicked successfully");
    }

    public void fillFirstNameInput(String firstName) {
        WebElement firstNameInput = driver.findElement(firstNameBy);
        firstNameInput.sendKeys(firstName);
        System.out.println("FirstName input field filled with: " + firstName);
    }

    public void fillLastNameInput(String lastName) {
        WebElement lastNameInput = driver.findElement(lastNameBy);
        lastNameInput.sendKeys(lastName);
        System.out.println("LastName input field filled with: " + lastName);
    }

    public void clickMaleRadio() {
        WebElement maleRadio = driver.findElement(maleRadioBy);
        maleRadio.click();
        System.out.println("maleRadio clicked");
    }

    public void clickExperienceRadio() {
        WebElement experienceRadio = driver.findElement(experienceRadioBy);
        experienceRadio.click();
        System.out.println("experienceRadio clicked");
    }

    public void fillDateInput(String date) {
        WebElement dateInputField = driver.findElement(dateInputBy);
        dateInputField.sendKeys(date);
    }

    public void clickAutomationTesterProfessionCheckbox() {
        WebElement professionCheckbox = driver.findElement(automationTesterCheckboxBy);
        professionCheckbox.click();
        System.out.println("professionCheckbox clicked");
    }

    public void fileUpload(String filePath) {
        WebElement fileUploadInput = driver.findElement(fileUploadBy);
        // MACOS esetén:
        //fileUploadInput.sendKeys(filePath);
        // WINDOWS esetén:
        fileUploadInput.sendKeys(filePath);
        System.out.println("fileupload happened with: " + filePath);
    }

    public void clickSeleniumFlavourCheckbox() {
        WebElement flavourOfSeleniumCheckbox = driver.findElement(seleniumWebdriverBy);
        flavourOfSeleniumCheckbox.click();
    }

    public void selectContinentsDropdown(String selectedValue) {
        Select continentsDropdown = new Select(driver.findElement(continentsDropdownBy));
        continentsDropdown.selectByVisibleText(selectedValue);
        System.out.println("Selected " + selectedValue + " from the continent dropdown.");
    }

    public void selectSeleniumCommandsDropdown(String selectedValue) {
        Select seleniumcommandsDropdown = new Select(driver.findElement(seleniumCommandsDropdownBy));
        seleniumcommandsDropdown.selectByVisibleText(selectedValue);
        System.out.println("Selected " + selectedValue + " from the Selenium commands dropdown.");
    }

    public void acceptBannerCookieButton() {
        WebElement acceptBannerCookieButton = wait.until(ExpectedConditions.elementToBeClickable(banneracceptBy));
        acceptBannerCookieButton.click();
        System.out.println("acceptBannerCookieButton clicked");
    }

    public void clickOnSubmitButton() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(submitButtonBy));
        // Actions actions = new Actions(driver);
        //jelenleg a DriverSetup metodusban hoztuk létre az actions változót és protected mivolta miatt tudjuk itt használni
        actions.moveToElement(submitButton);
        actions.perform();
        submitButton.click();
        System.out.println("submitButton clicked");
    }
}
