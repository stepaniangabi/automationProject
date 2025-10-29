package helpMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementsMethod {

    public WebDriver driver;

    public ElementsMethod(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element){
        waitVisibleElement(element);
        element.click();
    }

    public void fillElement(WebElement element, String text){
        waitVisibleElement(element);
        element.sendKeys(text);
    }

    public void waitVisibleElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void javaScriptElement(WebElement element){
        JavascriptExecutor js = ( JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }
}