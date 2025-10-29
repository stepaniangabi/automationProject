package tests;

import helpMethods.ElementsMethod;
import helpMethods.FrameMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
    public WebDriver driver;
    ElementsMethod elementsMethod;
    FrameMethods frameMethods;

    @Test

    public void metodaTest() {
        //Deschidem un browser

        driver = new ChromeDriver();
        elementsMethod = new ElementsMethod(driver);
        frameMethods = new FrameMethods(driver);

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        WebElement framesMeniu = driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']"));
        elementsMethod.javaScriptElement(framesMeniu);
        WebElement tabButton = driver.findElement(By.xpath("//span[text()='Frames']"));
        elementsMethod.javaScriptElement(tabButton);

        frameMethods.switchToSpecificFrame("frame1");

        frameMethods.switchToParent();

        frameMethods.switchToSpecificFrame("frame2");
    }
}