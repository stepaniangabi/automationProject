package pages;

import helpMethods.ElementsMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPages {

    public class AlertPages{
       public WebDriver driver;
       public ElementsMethod elementsMethod;

        public AlertPages(WebDriver driver) {
            this.driver = driver;
            elementsMethod = new ElementsMethod(this.driver);
            PageFactory.initElements(this.driver, this);
        }
        @FindBy(xpath= "//span[text()='Alerts']")
    }
