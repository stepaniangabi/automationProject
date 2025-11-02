package testPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTestPractice {

    public WebDriver driver;

    @Test

    public void metodaTest() {

        // deschidem un browser

        driver= new ChromeDriver();

        //accesam un URL

        driver.get("https://demoqa.com/webtables");

        driver.manage().window().maximize();

        // definim un element

        WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstName = "Madalina";
        firstNameElement.sendKeys(firstName);

        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastName = "Chera";
        lastNameElement.sendKeys(lastName);

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        String email = "mail.madalina.chera@gmail.ro";
        emailElement.sendKeys(email);

        WebElement ageElement = driver.findElement(By.id("age"));
        String age = "30";
        ageElement.sendKeys(age);

        WebElement salaryElement = driver.findElement(By.id("salary"));
        String salary = "5000";
        salaryElement.sendKeys(salary);

        WebElement departamentElement = driver.findElement(By.id("department"));
        String departament = "calitate";
        departamentElement.sendKeys(departament);

        WebElement submitElement = driver.findElement(By.id("submit"));
        submitElement.click();
    }
    @Test
    public void metodaTest1() {

        // deschidem un browser

        driver = new ChromeDriver();

        //accesam un URL

        driver.get("https://demoqa.com/text-box");

        driver.manage().window().maximize();

        WebElement fullnameElement = driver.findElement(By.id("userName"));
        String fullname = "Madalina Chera";
        fullnameElement.sendKeys(fullname);

        WebElement emailElement = driver.findElement(By.id("userEmail"));
        String email = "Madalina@yahoo.com";
        emailElement.sendKeys(email);

        WebElement currentaddressElement = driver.findElement(By.id("currentAddress"));
        String currentaddress = "Timis";
        currentaddressElement.sendKeys(currentaddress);

        WebElement permanentaddressElement = driver.findElement(By.id("permanentAddress"));
        String permanentaddress = "Timisoara";
        permanentaddressElement.sendKeys(permanentaddress);

        WebElement submitElement = driver.findElement(By.id("submit"));
        submitElement.click();
    }
}