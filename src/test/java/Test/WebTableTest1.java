package tests;

import helpMethods.ElementsMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class WebTableTest1 {

    public WebDriver driver;

    ElementsMethod elementsMethod;

    @Test

    public void metodaTest() {

        //Deschidem un browser

        driver = new ChromeDriver();

        //Accesam un URL

        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        elementsMethod = new ElementsMethod(driver);

        WebElement elementsMeniu = driver.findElement(By.xpath("//h5[text()='Elements']"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        elementsMethod.javaScriptElement(elementsMeniu);


        WebElement webTable = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        webTable.click();

        List<WebElement> continutTabel = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
//        System.out.println("Diminesiunea tabelului este "+continutTabel.size());
        Assert.assertEquals(continutTabel.size(), 3, "Marimea tabelului nu este 3 ");


// Definim un element
        WebElement addElement = driver.findElement(By.id("addNewRecordButton"));
        addElement.click();

// First Name
        WebElement firstNameElement = driver.findElement(By.id("firstName"));
        String firstName = "Iulian";
        elementsMethod.fillElement(firstNameElement, firstName);

// Last Name
        WebElement lastNameElement = driver.findElement(By.id("lastName"));
        String lastName = "Roteliuc";
        elementsMethod.fillElement(lastNameElement, lastName);

// Email
        WebElement userEmailElement = driver.findElement(By.id("userEmail"));
        String userEmail = "roteliuc.iulian@gmail.com";
        elementsMethod.fillElement(userEmailElement, userEmail);

// Age
        WebElement ageElement = driver.findElement(By.id("age"));
        String age = "31";
        elementsMethod.fillElement(ageElement, age);

// Salary
        WebElement salaryElement = driver.findElement(By.id("salary"));
        String salary = "5000";
        elementsMethod.fillElement(salaryElement, salary);

// Department
        WebElement departmentElement = driver.findElement(By.id("department"));
        String department = "Discogs";
        elementsMethod.fillElement(departmentElement, department);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //Validam noua dimensiune a tabelului
        List<WebElement> continutTabelNou = driver.findElements(By.xpath("//div[@class='rt-tbody']/div/div[@class='rt-tr -odd' or @class='rt-tr -even']"));
        Assert.assertEquals(continutTabelNou.size(), 4, "Marimea tabelului nu este 4 ");
        //Validam valorile pe care le-am introdus
        String continutRand = continutTabelNou.get(3).getText();
        Assert.assertTrue(continutRand.contains(firstName), "Randul nu contine first name ");
        Assert.assertTrue(continutRand.contains(lastName), "Randul nu contine last name");
        Assert.assertTrue(continutRand.contains(userEmail), "Randul nu contine user email");
        Assert.assertTrue(continutRand.contains(age), "Randul nu contine age");
        Assert.assertTrue(continutRand.contains(salary), "Randul nu contine salary");
        Assert.assertTrue(continutRand.contains(department), "Randul nu contine departament");

    }
}

// Daca vrem sa identificam un element dupa text putem face asta doar cu XPath.
// CSS Selector nu permite acest lucru.
// XPath are o structura specifica: tag,atribut,valoare
// CTRL + F ca sa deschidem searchul
// formula pentru XPath Relative //h5[text()='Elements']