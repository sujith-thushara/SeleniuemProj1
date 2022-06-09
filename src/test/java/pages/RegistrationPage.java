package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public  class RegistrationPage {
    private static WebElement webElement = null;

    public static WebElement getFirstName(WebDriver driver){
        webElement = driver.findElement(By.name("firstname"));

        return webElement;
    }

    public static WebElement getLastName(WebDriver driver){
        webElement = driver.findElement(By.name("lastname"));

        return webElement;
    }

    public static WebElement getGender(WebDriver driver){
        webElement = driver.findElement(By.id("sex-0"));
        return webElement;
    }

    public static WebElement getExp(WebDriver driver){
        webElement= driver.findElement(By.id("exp-4"));
        return webElement;
    }

    public static Select getDrpDownName(WebDriver driver, String txt){

//        WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(2));
//        wait2.until(ExpectedConditions.invisibilityOfElementLocated(By.id("continents")));
//        driver.findElement(By.xpath("xpath_element_to_be_clicked")).click();

        driver.findElement(By.id("continents")).click();
        Select country = new Select(driver.findElement(By.id("continents")));
        country.selectByVisibleText("Europe");


        return country;

    }



    public static WebElement getSubmitBtn (WebDriver driver){
        webElement = driver.findElement(By.id("submit"));
        return webElement;
    }

    public static WebElement getDrp(WebDriver driver){

        webElement = driver.findElement(By.id("continents"));
        return  webElement;
    }

    public static WebElement getLink(WebDriver driver){
        driver.findElement(By.linkText("Click here to Download File"));
        return webElement;

    }

    public static String findPageName(WebDriver driver){
        String page_name = driver.findElement(By.xpath("//*[contains(@class, 'post-title entry-title')]")).getText();

        return page_name;
    }



}
