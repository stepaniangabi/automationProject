package tests;

import helpMethods.AlertsMethods;
import helpMethods.ElementsMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.time.Duration;

public class AlertTest {

    public WebDriver driver;
    ElementsMethod elementsMethod;
    AlertsMethods alertsMethods;

    @Test

    public void metodaTest() {

        driver = new ChromeDriver();
        elementsMethod = new ElementsMethod(driver);
        alertsMethods = new AlertsMethods(driver);

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();

        HomePage homePage=new HomePage(driver);
        homePage.clickAlertFrameWindow();

        WebElement tabButton = driver.findElement(By.xpath("//span[text()='Alerts']"));
        elementsMethod.clickElement(tabButton);

        WebElement firstAlertElement = driver.findElement(By.id("alertButton"));
        elementsMethod.clickElement(firstAlertElement);

        alertsMethods.acceptAlert();

        WebElement secondAlert = driver.findElement(By.id("timerAlertButton"));
        elementsMethod.clickElement(secondAlert);

        alertsMethods.acceptAlert();

        WebElement thirdAlertElement = driver.findElement(By.id("confirmButton"));
        elementsMethod.clickElement(thirdAlertElement);

        boolean chooseAccept = true;  // pune false daca vrei Cancel
        alertsMethods.acceptAlert(chooseAccept);

        WebElement textThirdAlert = driver.findElement(By.id("confirmResult"));
        String actualText = textThirdAlert.getText();
        alertsMethods.verifyConfirmAlert(actualText, true);

        WebElement fourthAlertElement = driver.findElement(By.id("promtButton"));
        elementsMethod.javaScriptElement(fourthAlertElement);
        alertsMethods.fillAlert("Buna");
    }
}