package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPageV2;

public class RegistrationWithTestNgTest {

    public static WebDriver driver = null;

    @BeforeMethod
    public void init(){
        driver = new SafariDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void registrationTest() throws InterruptedException {
        Thread.sleep(1000);
        RegistrationPageV2 registrationPageV2 = new RegistrationPageV2(driver);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        registrationPageV2.set_fname("Sujith");
        registrationPageV2.set_lname("lname");
    }

    @AfterMethod
    public void conclude(){
        driver.close();

        //test
    }

}
