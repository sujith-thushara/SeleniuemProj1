package tests;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserTest {

    public static void main(String[] args) {


//        System.setProperty("webdriver.chrome.driver", "/Users/sujiththushara/IdeaProjects/SeleniuemProj1/src/main/resources/chromedriver");
//        SafariOptions options = new SafariOptions();
//        options.("--start-maximized");
//        WebDriver driver = new ChromeDriver(options);

        WebDriver driver1 = new SafariDriver();
//      WebDriver driver = new ChromeDriver();
        driver1.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver1.manage().window().maximize();

        String text = driver1.findElement(By.xpath("//*[contains(@class, 'post-title entry-title')]")).getText();
        System.out.println("Text is " +text);

        driver1.findElement(By.name("firstname")).sendKeys("Sujith");
        driver1.findElement(By.name("lastname")).sendKeys("Thushara");

        WebElement male = driver1.findElement(By.id("sex-0"));
        WebElement female = driver1.findElement(By.id("sex-1"));
        male.click();

        WebElement exp = driver1.findElement(By.id("exp-4"));
        exp.click();









        System.out.println("+++++++++++");

//        driver1.close();


    }
}
