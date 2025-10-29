package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebPracticeForm {

    public WebDriver browser;

    @Test
    public void testMethod() {
        browser = new ChromeDriver();  // cheama functionalitatea Chrome
        browser.get("https://demoqa.com/automation-practice-form");  // se deschide browserul si navigheaza la URL
        browser.manage().window().maximize();    // full screen

        WebElement firstNameElement = browser.findElement(By.id("firstName")); // gaseste in pagina WebElementul cu id-ul unic "firstName"
        String firstName = "Gabriella"; // definim variabila Gabriella, care e de tip String si ii asignam valoarea de test Gabriella
        firstNameElement.sendKeys(firstName);

        WebElement lastNameElement = browser.findElement(By.id("lastName")); // gaseste in pagina WebElementul cu id-ul unic "firstName"
        String lastName = "Stepanian"; // definim variabila Gabriella, care e de tip String si ii asignam valoarea de test Gabriella
        lastNameElement.sendKeys(lastName);

//        WebElement genderFemaleElement = browser.findElement(By.xpath("//label[text()='Female']")); // gaseste in pagina WebElementul cu id-ul unic "firstName"
//        String genderFemale = "female"; // definim variabila Gabriella, care e de tip String si ii asignam valoarea de test Gabriella
//        genderFemaleElement.sendKeys(label[text() = "Female"]);

        WebElement mobileNumberElement = browser.findElement(By.id("userNumber")); // gaseste in pagina WebElementul cu id-ul unic "firstName"
        String userNumber = "0728865593"; // definim variabila Gabriella, care e de tip String si ii asignam valoarea de test Gabriella
        mobileNumberElement.sendKeys(userNumber);

        WebElement submitElement = browser.findElement(By.id("submit"));
        submitElement.click();
    }
}
