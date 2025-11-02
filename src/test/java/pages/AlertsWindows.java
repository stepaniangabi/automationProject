package pages;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsWindows {

    public WebDriver driver;
    public ElementsMethod elementsMethod;

    public AlertsWindows(WebDriver driver) {
        this.driver = driver;
        elementsMethod = new ElementsMethod(this.driver);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alert;

    public void clickAlert(){
        elementsMethod.javaScriptElement(alert);
    }

}